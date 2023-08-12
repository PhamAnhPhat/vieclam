/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.service.CityService;
import com.mycompany.service.DistrictService;
import com.mycompany.service.EducationService;
import com.mycompany.service.JobService;
import com.mycompany.service.MajorService;
import com.mycompany.service.TypeJobService;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */
@Controller
@PropertySource("classpath:configs.properties")
public class IndexController {
    @Autowired
    private Environment env;
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
    @Autowired
    private TypeJobService TypeService;
    
    @Autowired
    private EducationService EduService;
    @RequestMapping("/")
    @Transactional
    public String index(Model model,@RequestParam Map<String,String>params){
        Session s = factory.getObject().getCurrentSession(); 
        
        model.addAttribute("Cities",this.CityService.getCity(null));

        model.addAttribute("quans",this.DistrictService.getDistrict(null));

        model.addAttribute("majors",this.MajorService.getMajor(null));
        
        model.addAttribute("edus",this.EduService.getEdu(null));
        
        model.addAttribute("jobs",this.JobService.getJob(null));
        
        model.addAttribute("types",this.TypeService.getTypeJob(null));
        
        int pageSize=Integer.parseInt(this.env.getProperty("PAGE_SIZE"));
        long count = this.JobService.countJob();
        model.addAttribute("counts",Math.ceil(count*1.0/pageSize));
        return "index";
    }
    
  
}
