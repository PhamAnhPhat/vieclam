/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.service.impl;

import com.qlvl.repository.ThongKeRepository;
import com.qlvl.service.ThongKeService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ThongKeServiceImpl implements ThongKeService{

    @Autowired
    private ThongKeRepository ThongKeRepo;
    
    @Override
    public List<Integer> getNumberMajor(Map<String, String> params) {
     return this.ThongKeRepo.getNumberMajor(params);
    }

    @Override
    public List<String> getNameMajor(Map<String, String> params) {
       return this.ThongKeRepo.getNameMajor(params);
    }
    
}
