/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.repository.impl;

import com.qlvl.pojo.Application;
import com.qlvl.repository.ApplicationRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Admin
 */
@Repository
@Transactional
@PropertySource("classpath:configs.properties")
public class ApplicationRepositoryImpl implements ApplicationRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public boolean addApp(Application app) {
         Session s = this.factory.getObject().getCurrentSession();
         try{
         if(app.getId()==null){
             s.save(app);
             return true;
         }
         else
             return false;
         
         }
         catch(HibernateException ex){
              ex.printStackTrace();
            return false;
         }
         

    }

}
