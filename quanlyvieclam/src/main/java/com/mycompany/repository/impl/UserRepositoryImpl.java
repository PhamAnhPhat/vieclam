/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.mycompany.pojo.Employer;
import com.mycompany.pojo.Role;
import com.mycompany.pojo.User;
import com.mycompany.repository.UserRepository;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private Cloudinary cloudinary;
    @Autowired
    private LocalSessionFactoryBean factory;

    @Autowired
    private Environment env;

    @PersistenceContext
    private EntityManager entity;

    @Override
    public boolean addUser(User u) {
        Session s = this.factory.getObject().getCurrentSession();

        try {
            if (u.getId() == null) {
                s.save(u);
            }
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public User findUserByUsername(String username) {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM User WHERE username=:un");
        q.setParameter("un", username);
        List results = q.getResultList();
        if (results.isEmpty()) return null;
        else if (results.size() == 1) return (User) results.get(0);
        throw new NonUniqueResultException();
    }

    @Override
    public User login(String username, String pwd) {
       Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM User WHERE username=:un and password=:pwd");
        q.setParameter("un",username);
        q.setParameter("pwd", pwd);
        List results=q.getResultList();
         if (results.isEmpty()) return null;
        else if (results.size() == 1) return (User) results.get(0);
        throw new NonUniqueResultException();
    }
}