/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formatters;

import com.mycompany.pojo.Typejob;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Admin
 */
public class TypeJobFormatter implements Formatter<Typejob>{
        @Override
    public String print(Typejob t, Locale locale) {
      return String.valueOf(t.getId());
    }

    @Override
    public Typejob parse(String t, Locale locale) throws ParseException {
      int id =Integer.parseInt(t);
      return new Typejob(id);
    }
}
