/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.configs;

import com.mycompany.formatters.CityFormatter;
import com.mycompany.formatters.DistrictFormatter;
import com.mycompany.formatters.EducationFormatter;
import com.mycompany.formatters.MajorFormatter;
import com.mycompany.formatters.TypeJobFormatter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Admin
 */
@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = {
"com.mycompany.controllers",
  "com.mycompany.repository",  
  "com.mycompany.service"
})
public class WebAppContextConfig implements WebMvcConfigurer{

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
      configurer.enable();
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
    registry.addFormatter(new CityFormatter());
    registry.addFormatter(new DistrictFormatter());
    registry.addFormatter(new MajorFormatter());
     registry.addFormatter(new EducationFormatter());
      registry.addFormatter(new TypeJobFormatter());
    }
    
    
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver r = new InternalResourceViewResolver();
        r.setViewClass(JstlView.class);
        r.setPrefix("WEB-INF/pages/");
        r.setSuffix(".jsp");
        return r;
    }
    
    
}
