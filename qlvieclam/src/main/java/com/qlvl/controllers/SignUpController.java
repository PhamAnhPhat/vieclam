/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.controllers;

import com.qlvl.pojo.User;
import com.qlvl.service.MajorService;
import com.qlvl.service.RoleService;
import com.qlvl.service.UserService;
import java.util.Map;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */
@Controller
public class SignUpController {

    @Autowired
    private UserService userService;
    @Autowired
    private MajorService MajorSer;
    @Autowired
    private RoleService RoleService;

    @GetMapping("/SignUp")
    public String SignUp(Model model, @RequestParam Map<String, String> params) {
        model.addAttribute("MAJOR", this.MajorSer.getMajor());
        model.addAttribute("roless", this.RoleService.getRole(null));
        model.addAttribute("signup", new User());
        return "SignUp";
    }

    @PostMapping("/SignUp")
    public String add(@ModelAttribute(value = "signup") @Valid User u, BindingResult rs) {
      
            if (userService.addUser(u) == true) {
                return "redirect:/login";
            }
      

        return "redirect:/SignUp";
    }
}
