package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Java implements Course {

    @Autowired
    private ExtraSessions extraSessions;
/*
    //Constructor Injection
    //@Autowired  - not required if there is only one constructor
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours(){
        System.out.println("Weekly teaching hours for Java:" + (30 + officeHours.getHours()));
    }
*/

    //Field injection
    public ExtraSessions getOfficeHours() {
        return extraSessions;
    }

    @Override
    public void getTeachingHours() {

    }
}
