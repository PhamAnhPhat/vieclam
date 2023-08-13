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
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
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
        TypedQuery<User> query = entity.createNamedQuery("User.findByUsername", User.class);
        query.setParameter("username", username);
        if (query !=null) {
            return query.getSingleResult();
        } else {
            return null;
        }
    }

}
