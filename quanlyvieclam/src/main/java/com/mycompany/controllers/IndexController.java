/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.service.CityService;
import com.mycompany.service.DistrictService;
import com.mycompany.service.JobService;
import com.mycompany.service.MajorService;
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
    
    @Autowired
    private DistrictService DistrictService;
    
    @Autowired
    private MajorService MajorService;
    @Autowired
    private CityService CityService;
    
    @RequestMapping("/")
    @Transactional
    public String index(Model model,Model major, Model edu, Model job){
        Session s = factory.getObject().getCurrentSession(); 
        
        model.addAttribute("Cities",this.CityService.getCity(null));

        model.addAttribute("quans",this.DistrictService.getDistrict(null));

        model.addAttribute("majors",this.MajorService.getMajor(null));
        
        Query q4= s.createQuery("FROM Education");
        edu.addAttribute("edus",q4.getResultList());
        
        model.addAttribute("jobs",this.JobService.getJob(null));
        
        return "index";
    }
    
    
}
