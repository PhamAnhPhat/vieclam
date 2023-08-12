/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatters;

import com.mycompany.pojo.Education;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Admin
 */
public class EducationFormatter implements Formatter<Education>{
        @Override
    public String print(Education e, Locale locale) {
      return String.valueOf(e.getId());
    }

    @Override
    public Education parse(String e, Locale locale) throws ParseException {
      int id =Integer.parseInt(e);
      return new Education(id);
    }
}
