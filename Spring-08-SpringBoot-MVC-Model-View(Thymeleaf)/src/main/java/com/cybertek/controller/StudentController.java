package com.cybertek.controller;

import com.cybertek.model.Student;
import org.apache.tomcat.jni.Local;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/student")
public class StudentController {
    @GetMapping ("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "AIGERIM BAIAZBEKOVA"); //binding to html
        model.addAttribute("course", "MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);


        //create  random student id and show it in your UI
        int id = 123;
        model.addAttribute("id",id);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);
        model.addAttribute("numbers", numbers);

        //printing bday
        LocalDate bday = LocalDate.now().minusYears(29);
        model.addAttribute("bday", bday);


        Student student = new Student (1, "Mike", "Smith");
        model.addAttribute("student", student);



        return "student/welcome";
    }

    @GetMapping("/register")
    public String homePage2(){
        return "student/register";
    }



}
