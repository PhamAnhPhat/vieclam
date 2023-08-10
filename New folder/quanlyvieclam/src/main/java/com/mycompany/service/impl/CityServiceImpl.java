/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.City;
import com.mycompany.repository.CityRepository;
import com.mycompany.service.CityService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    public CityRepository CityRepo;
    
    @Override
    public List<City> getCity(Map<String, String> params) {
      return this.CityRepo.getCity(params);
    }
    
}
