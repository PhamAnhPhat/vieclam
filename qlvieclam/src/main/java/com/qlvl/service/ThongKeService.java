/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.qlvl.service;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface ThongKeService {
    List<String> getNameMajor(Map<String,String> params);
    List<Integer> getNumberMajor(Map<String,String> params);
}
