/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.formatters;

import com.mycompany.pojo.Role;
import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;

/**
 *
 * @author Admin
 */
public class RoleFormatter implements Formatter<Role>{
     @Override
    public String print(Role t, Locale locale) {
      return String.valueOf(t.getId());
    }

    @Override
    public Role parse(String r, Locale locale) throws ParseException {
      int id =Integer.parseInt(r);
      return new Role(id);
    }
}
