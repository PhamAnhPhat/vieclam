/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.controllers;

import com.qlvl.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Admin
 */
@Controller
public class ReviewController {
     @Autowired
    private EmployerService EmpSer;
     
    @GetMapping("/Review")
    @Transactional
    public String Review(Model model){
        model.addAttribute("EMP", this.EmpSer.getAllEmpl());
        return"Review";
    }
}
