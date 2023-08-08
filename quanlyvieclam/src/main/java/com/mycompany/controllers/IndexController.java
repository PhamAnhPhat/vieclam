/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.service.JobService;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
public class IndexController {
    
    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Autowired
    private JobService JobService;
    
    @RequestMapping("/")
    @Transactional
    public String index(Model city,Model district,Model major, Model edu, Model job){
        Session s = factory.getObject().getCurrentSession();
        Query q = s.createQuery("FROM City");    
        city.addAttribute("Cities",q.getResultList());
        
        Query q2= s.createQuery("FROM District");
        district.addAttribute("quans",q2.getResultList());
        
        Query q3= s.createQuery("FROM Major");
        major.addAttribute("majors",q3.getResultList());
        
        Query q4= s.createQuery("FROM Education");
        edu.addAttribute("edus",q4.getResultList());
        
        job.addAttribute("jobs",this.JobService.getJob(null));
        
        return "index";
    }
    
    
}
