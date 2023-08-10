/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.District;
import com.mycompany.repository.DistrictRepository;
import com.mycompany.service.DistrictService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class DistrictServiceImpl implements DistrictService{

    @Autowired
    public DistrictRepository DistrictRepo;
    
    @Override
    public List<District> getDistrict(Map<String, String> params) {
       return this.DistrictRepo.getDistrict(params);
    }
    
}
