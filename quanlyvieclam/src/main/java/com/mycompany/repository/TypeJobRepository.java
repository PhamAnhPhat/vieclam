/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.repository;


import com.mycompany.pojo.Typejob;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface TypeJobRepository {
     List<Typejob> getTypeJob(Map<String,String> params);
}
