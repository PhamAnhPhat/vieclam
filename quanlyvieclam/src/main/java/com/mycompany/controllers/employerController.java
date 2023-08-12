/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.service.CityService;
import com.mycompany.service.DistrictService;
import com.mycompany.service.EducationService;
import com.mycompany.service.MajorService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Admin
 */
@Controller
public class employerController {

    @Autowired
    private Environment env;
    @Autowired
    private LocalSessionFactoryBean factory;
    @Autowired
    private DistrictService DistrictService;
    
    @Autowired
    private MajorService MajorService;
    @Autowired
    private CityService CityService;
     @Autowired
    private EducationService EduService;
    @GetMapping("/employer")
    @Transactional
    public String employer(Model model) {
        Session s = factory.getObject().getCurrentSession();
         model.addAttribute("Cities",this.CityService.getCity(null));

        model.addAttribute("quans",this.DistrictService.getDistrict(null));

        model.addAttribute("majors",this.MajorService.getMajor(null));
         model.addAttribute("edus",this.EduService.getEdu(null));
        return "employer";
    }
}
