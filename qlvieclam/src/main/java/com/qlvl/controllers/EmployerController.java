/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.controllers;


import com.qlvl.pojo.Employer;
import com.qlvl.service.EmployerService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Admin
 */
@Controller
public class EmployerController {
    @Autowired
    private EmployerService EmplSer;
    
    @GetMapping("/Employer")
    @Transactional
    public String Employer(Model model){
        model.addAttribute("emp",new Employer());
        return"Employer";
    }
    
    @PostMapping("/Employer")
    public String addEmployer(@ModelAttribute(value = "emp") @Valid Employer e, BindingResult rs){
         if (!rs.hasErrors()) {
            if (EmplSer.addEmployer(e) == true) {
                return "redirect:/";
            }
        }
        return "Employer";
    }
}
