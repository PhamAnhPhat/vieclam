/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Job;
import com.mycompany.repository.JobRepository;
import com.mycompany.service.JobService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class JobServiceImpl implements JobService{

    @Autowired
    private JobRepository JobRepo;
     
    @Override
    public List<Job> getJob(Map<String, String> params) {
       return this.JobRepo.getJob(params);
    }
    
}
