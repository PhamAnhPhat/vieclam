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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    @Transactional
    public String addUser(@ModelAttribute(value = "user") User u, RedirectAttributes redirect) {
        if (userService.findUserByUsername(u.getUsername()) == null) {
            this.userService.addUser(u);
            return "login";
        }

        if (userService.findUserByUsername(u.getUsername()) != null) {
            redirect.addFlashAttribute("message", "Tài khoản đã tồn tại");
            return "redirect:/SignUp";
        }
        return "login";
    }
}
