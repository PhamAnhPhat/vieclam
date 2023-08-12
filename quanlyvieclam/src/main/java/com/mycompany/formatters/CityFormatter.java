/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatters;

import com.mycompany.pojo.City;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;


/**
 *
 * @author Admin
 */
public class CityFormatter implements  Formatter<City>{

    @Override
    public String print(City ct, Locale locale) {
      return String.valueOf(ct.getId());
    }

    @Override
    public City parse(String ctId, Locale locale) throws ParseException {
      int id =Integer.parseInt(ctId);
      return new City(id);
    }
    
}
