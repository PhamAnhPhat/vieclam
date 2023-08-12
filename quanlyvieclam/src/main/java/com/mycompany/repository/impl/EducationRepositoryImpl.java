/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.mycompany.pojo.Education;
import com.mycompany.repository.EducationRepository;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
public class EducationRepositoryImpl implements EducationRepository{

      @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<Education> getEdu(Map<String, String> params) {
     Session session = this.factory.getObject().getCurrentSession();
        Query query = session.createQuery("FROM Education");
        return query.getResultList();
    }
    
}
