/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.repository;

import com.mycompany.pojo.User;

/**
 *
 * @author Admin
 */
public interface UserRepository {
    boolean addUser(User u);
    public User findUserByUsername(String username);

}
