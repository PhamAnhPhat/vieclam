/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatters;

import com.mycompany.pojo.Major;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Admin
 */
public class MajorFormatter implements Formatter<Major>{
        @Override
    public String print(Major m, Locale locale) {
      return String.valueOf(m.getId());
    }

    @Override
    public Major parse(String m, Locale locale) throws ParseException {
      int id =Integer.parseInt(m);
      return new Major(id);
    }
}
