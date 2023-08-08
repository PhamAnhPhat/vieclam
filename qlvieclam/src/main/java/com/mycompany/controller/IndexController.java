/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
public class IndexController {
    
    @Autowired
    private LocalSessionFactoryBean factory;
    
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("msg","My viec làm");
        return "index";
    }
    
//   @RequestMapping("/admin")
//    public String admin(Model model){
//        model.addAttribute("msg","My viec làm");
//        return "admin";
//    }
}
