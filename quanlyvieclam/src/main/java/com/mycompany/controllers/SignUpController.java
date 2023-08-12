/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.User;
import com.mycompany.service.RoleService;
import com.mycompany.service.UserService;
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

public class SignUpController {

    @Autowired
    private RoleService RoleService;
    @Autowired
    private UserService userService;

    @GetMapping("/SignUp")
    @Transactional
    public String signUp(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("roless", this.RoleService.getRole(null));
        return "SignUp";
    }

    @PostMapping("/SignUp")
    public String addUser(@ModelAttribute(value = "user") User u) {
        if (userService.addUser(u) == true) {
            return "login";
        } else {
            return "SignUp";
        }
    }
}
