/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.qlvl.repository;

import java.util.Map;

/**
 *
 * @author Admin
 */
public interface ThongKeRepository {
    Map<String,Integer> countNgheNghiepByYear(int year);
}
