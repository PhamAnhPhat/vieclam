/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.pojo.Job;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface JobService {
    List<Job> getJob(Map<String,String> params);
     Long countJob();
     boolean addJob(Job j);
}
