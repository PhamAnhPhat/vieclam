/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repository.impl;

import com.mycompany.pojo.City;
import com.mycompany.repository.CityRepository;
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
public class CityRepositoryImpl implements CityRepository{

     @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<City> getCity(Map<String, String> params) {
        Session session = this.factory.getObject().getCurrentSession();
        Query query = session.createQuery("FROM City");
        return query.getResultList();
    }
    
}
