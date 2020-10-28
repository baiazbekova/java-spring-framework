package com.cybertek.services;

import com.cybertek.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private OfficeHours officeHours;

    //Setter Injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }


    public void getTeachingHours() {
        System.out.println("Weekly teaching hours for Selenium is: "+ (10+officeHours.getHours()));
    }
}
