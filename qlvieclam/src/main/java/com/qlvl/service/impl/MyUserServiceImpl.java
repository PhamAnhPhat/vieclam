/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.qlvl.pojo.User;
import com.qlvl.repository.MyUserRepository;
import com.qlvl.service.MyUserService;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class MyUserServiceImpl implements MyUserService {

    @Autowired
    private Cloudinary cloudinary;
    @Autowired
    private MyUserRepository MyUserRepo;

    @Override
    public boolean addUser(User u) {
        if (!u.getFile().isEmpty()) {
            try {
                Map res = this.cloudinary.uploader().upload(u.getFile().getBytes(),
                        ObjectUtils.asMap("resource_type", "auto"));
                u.setAvatar(res.get("secure_url").toString());
            } catch (IOException ex) {
                Logger.getLogger(MyUserServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.MyUserRepo.addUser(u);
    }

}
