/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Typejob;
import com.mycompany.repository.TypeJobRepository;
import com.mycompany.service.TypeJobService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class TypeJobServiceImpl implements TypeJobService {

    @Autowired
    public TypeJobRepository TypeJobRepo;

    @Override
    public List<Typejob> getTypeJob(Map<String, String> params) {
        return this.TypeJobRepo.getTypeJob(params);
    }

}
