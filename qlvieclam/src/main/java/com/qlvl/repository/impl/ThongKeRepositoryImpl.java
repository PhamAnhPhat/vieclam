/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.repository.impl;

import com.qlvl.repository.ThongKeRepository;
import java.util.List;
import java.util.Map;
import javassist.convert.Transformer;
import javax.persistence.Query;
import org.hibernate.Session;
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
public class ThongKeRepositoryImpl implements ThongKeRepository {

    @Autowired
    private LocalSessionFactoryBean factory;


    @Override
    public List<Integer> getNumberMajor(Map<String, String> params) {
     Session session = this.factory.getObject().getCurrentSession();
        Query query = session.createQuery("SELECT COUNT(*) FROM  Application GROUP BY ngheNghiep");
        
        return query.getResultList();
    }

    @Override
    public List<String> getNameMajor(Map<String, String> params) {
     Session session = this.factory.getObject().getCurrentSession();
        Query query = session.createQuery("SELECT ngheNghiep FROM  Application GROUP BY ngheNghiep");
        
        return query.getResultList();
    }

}
