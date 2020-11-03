package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Java implements Course {

    //creating an injection
    private ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;

    }

    public void getTeachingHours() {
        System.out.println("Java hours" + (30 + extraSessions.getHours()));
    }
}

