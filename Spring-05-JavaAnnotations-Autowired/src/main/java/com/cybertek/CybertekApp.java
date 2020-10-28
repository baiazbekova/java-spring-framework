package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        //Constructor injection
        Course course = container.getBean("java", Course.class);
        course.getTeachingHours(); //Weekly teaching hours for Java:34

        //Setter injection
        Course course1 = container.getBean("selenium", Course.class);
        course1.getTeachingHours();


    }
}
