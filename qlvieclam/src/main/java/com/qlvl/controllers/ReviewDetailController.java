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
public class ReviewDetailController {

    @Autowired
    private EmployerService EmpSer;

    @GetMapping("/ReviewDetail")
    public String ReviewDetail(Model model) {
        return "ReviewDetail";
    }

    @GetMapping("/ReviewDetail/{id}")
    public String UpdateView(Model model, @PathVariable(value = "id") int id) {
        model.addAttribute("EMPLOYER", this.EmpSer.getEmployerByID(id));
        return "ReviewDetail";
    }
    @PostMapping("/ReviewDetail")
    public String addReview(@ModelAttribute(value = "EMPLOYER") @Valid Employer e, BindingResult rs) {
      
        return "redirect:/CheckEmployer";
    }
   
}
