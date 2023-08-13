/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controllers;

import com.mycompany.pojo.User;
import com.mycompany.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class loginController {
      @Autowired
    private UserService userService;
      
     @GetMapping("/login")
   public String login(Model model){
        model.addAttribute("user", new User());
       return "login";
   }
   @PostMapping("/login")
   public String LogIn(@ModelAttribute(value = "user")User u, RedirectAttributes redirect){
       if(userService.login(u.getUsername(), u.getPassword())==null)
       {
            redirect.addFlashAttribute("message", "Sai mật khẩu/tài khoản");
            return "redirect:/login";
       }
       else{
            return "redirect:/";
       }
      
   }
   
  
}
