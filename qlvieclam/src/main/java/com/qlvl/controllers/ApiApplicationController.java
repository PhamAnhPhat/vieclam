/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlvl.controllers;

import com.cloudinary.http44.api.Response;
import com.qlvl.pojo.Application;
import com.qlvl.service.ThongKeService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/api")
public class ApiApplicationController {
    @Autowired
    private ThongKeService ThongKeSer;
    @RequestMapping("/GetThongKeByNumberMajor/")
    @CrossOrigin
    public ResponseEntity<List<Application>>getApplication(@RequestParam Map<String, String> params){
        List applyJob = this.ThongKeSer.getNumberMajor(params);
        return ResponseEntity.ok(applyJob);
    }
    @RequestMapping("/GetThongKeByNameMajor/")
    @CrossOrigin
    public ResponseEntity<List<Application>>getNameMajor(@RequestParam Map<String, String> params){
        List applyJob = this.ThongKeSer.getNameMajor(params);
        return ResponseEntity.ok(applyJob);
    }
}
