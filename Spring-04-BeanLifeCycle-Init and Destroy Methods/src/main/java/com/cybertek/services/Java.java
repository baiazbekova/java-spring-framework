package com.cybertek.services;

import com.cybertek.interfaces.Course;


public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: 20");
    }


    //init method
    public void myInitMethod(){
        System.out.println("executing init method");
    }
    public void myDestroymethod(){
        System.out.println("executing destroy method");
    }

}



