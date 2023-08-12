/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service.impl;

import com.mycompany.pojo.Education;
import com.mycompany.repository.EducationRepository;
import com.mycompany.service.EducationService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class EducationServiceImpl implements EducationService {

    @Autowired
    public EducationRepository EduRepo;

    @Override
    public List<Education> getEdu(Map<String, String> params) {
        return this.EduRepo.getEdu(params);
    }

}
