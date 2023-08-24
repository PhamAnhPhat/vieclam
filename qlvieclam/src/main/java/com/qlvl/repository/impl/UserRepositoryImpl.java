/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.repository.impl;

import com.qlvl.pojo.User;
import com.qlvl.repository.UserRepository;
import java.util.List;
import javax.persistence.NonUniqueResultException;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
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
    private LocalSessionFactoryBean factory;

    @Override
    public User getUserByUserName(String username) {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM User WHERE username=:un");
        q.setParameter("un", username);
        return (User) q.getSingleResult();
    }

    @Override
    public User addUser(User u) {
        Session s = this.factory.getObject().getCurrentSession();
        s.save(u);
        return u;
    }

    @Override
    public User findUserByUserName(String username) {
      Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM User WHERE username=:un");
        q.setParameter("un", username);
        List results = q.getResultList();
        if (results.isEmpty()) return null;
        else if (results.size() == 1) return (User) results.get(0);
        throw new NonUniqueResultException();    
    }

    @Override
    public User getUserById(int id) {
       Session s = this.factory.getObject().getCurrentSession();
         return s.get(User.class, id);
    }

 

   

}
