/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.Job;
import com.mycompany.service.CityService;
import com.mycompany.service.DistrictService;
import com.mycompany.service.EducationService;
import com.mycompany.service.JobService;
import com.mycompany.service.MajorService;
import com.mycompany.service.TypeJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Admin
 */
@Controller
public class createJobController {

    @Autowired
    private JobService JobService;
    @Autowired
    private CityService CityService;
    @Autowired
    private DistrictService DistrictService;
    @Autowired
    private MajorService MajorService;
    @Autowired
    private EducationService EduService;
    @Autowired
    private TypeJobService TypeService;

    @GetMapping("/createJob")
    @Transactional
    public String createJob(Model model) {
        model.addAttribute("job", new Job());
        model.addAttribute("Cities", this.CityService.getCity(null));
        model.addAttribute("quans", this.DistrictService.getDistrict(null));
        model.addAttribute("majors", this.MajorService.getMajor(null));
        model.addAttribute("edus", this.EduService.getEdu(null));
        model.addAttribute("types", this.TypeService.getTypeJob(null));

        return "createJob";
    }
    @PostMapping("/createJob")
    public String add(@ModelAttribute(value = "job")Job j){
        if(JobService.addJob(j)==true){
            return"redirect:/";
        }
        else
            return"employer";
    }

}
