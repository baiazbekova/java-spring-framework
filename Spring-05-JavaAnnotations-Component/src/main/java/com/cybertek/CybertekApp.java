package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java", Course.class); //Weekly teaching hours for Java is 30

        Course course1 = container.getBean("selenium", Course.class); //Weekly teaching hours for Selenium is 20.

        Course course2 = container.getBean("API", Course.class);//Weekly teaching hours for API is 50.

        course.getTeachingHours();
        course1.getTeachingHours();
        course2.getTeachingHours();
    }
}
