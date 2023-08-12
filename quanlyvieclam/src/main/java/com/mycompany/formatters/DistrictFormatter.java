/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatters;

import com.mycompany.pojo.District;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;


/**
 *
 * @author Admin
 */
public class DistrictFormatter implements Formatter<District>{
        @Override
    public String print(District dt, Locale locale) {
      return String.valueOf(dt.getId());
    }

    @Override
    public District parse(String dsId, Locale locale) throws ParseException {
      int id =Integer.parseInt(dsId);
      return new District(id);
    }
}
