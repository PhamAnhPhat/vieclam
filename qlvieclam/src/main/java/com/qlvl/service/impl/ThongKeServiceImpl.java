/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.service.impl;

import com.qlvl.repository.ThongKeRepository;
import com.qlvl.service.ThongKeService;
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
    public Map<String, Integer> countNgheNghiepByYear(int year) {
     return  this.ThongKeRepo.countNgheNghiepByYear(year);
    }
    
}
