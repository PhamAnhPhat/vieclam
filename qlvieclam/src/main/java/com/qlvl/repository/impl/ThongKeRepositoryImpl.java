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

/**
 *
 * @author Admin
 */
@Repository
public class ThongKeRepositoryImpl implements ThongKeRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public Map<String, Integer> countNgheNghiepByYear(int year) {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("SELECT NgheNghiep, COUNT(*) FROM Application WHERE YEAR(createDate)=:year GROUP BY NgheNghiep");
         q.setParameter("year", year);
         return (Map<String, Integer>) q.getResultList(); 
    }

}
