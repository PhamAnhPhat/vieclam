/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Major;
import com.mycompany.repository.MajorRepository;
import com.mycompany.service.MajorService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class MajorServiceImpl implements MajorService{

    @Autowired
    public MajorRepository MajorRepo;
    
    @Override
    public List<Major> getMajor(Map<String, String> params) {
      return this.MajorRepo.getMajor(params);
    }
    
}
