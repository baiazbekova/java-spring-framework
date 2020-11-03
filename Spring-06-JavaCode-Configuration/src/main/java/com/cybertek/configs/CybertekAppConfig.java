package com.cybertek.configs;

import com.cybertek.interfaces.ExtraSessions;
import com.cybertek.services.Java;
import com.cybertek.services.OfficeHours;
import com.cybertek.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan ("com.cybertek")  //spring will scan and then create objects
public class CybertekAppConfig {

    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }

    //1st way
//    @Bean
//    public OfficeHours officeHours(){
//        return new OfficeHours();
//    }

    //2nd way = more loosely coupled way
    @Bean
    public ExtraSessions extraSessions(){ //ExtraSessions ex = new OfficeHours();
        return new OfficeHours();
    }

}
