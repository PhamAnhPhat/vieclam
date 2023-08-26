/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.qlvl.service;


import com.qlvl.pojo.User;
import java.util.List;
import java.util.Map;
import org.springframework.security.core.userdetails.UserDetailsService;


/**
 *
 * @author Admin
 */
public interface UserService  extends  UserDetailsService{
   boolean addUser(User u);
   User getUserById(int id);
    List<User> getUsername(Map<String,String> params);
}
