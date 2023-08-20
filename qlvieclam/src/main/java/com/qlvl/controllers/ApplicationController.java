/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.controllers;

import com.qlvl.pojo.Application;
import com.qlvl.service.ApplicationService;
import com.qlvl.service.EducationService;
import com.qlvl.service.JobService;
import com.qlvl.service.MajorService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Admin
 */
@Controller
public class ApplicationController {

    @Autowired
    private ApplicationService AppliSer;
    @Autowired
    private JobService JobSer;
    @Autowired
    private MajorService MajorSer;
    @Autowired
    private EducationService EduService;
 


    @GetMapping("/Application")
    @Transactional
    public String Application(Model model) {
        model.addAttribute("app", new Application());
        model.addAttribute("MAJOR",this.MajorSer.getMajor(null));
         model.addAttribute("EDUCATION", this.EduService.getEdu(null));
        return "Application";
    }

    @PostMapping("/Application")
    public String addApplication(@ModelAttribute(value = "app") @Valid Application a, BindingResult rs) {
        if (!rs.hasErrors()) {
            if (AppliSer.addApp(a) == true) {
                return "redirect:/";
            }
        }
        return "Application";
    }

}
