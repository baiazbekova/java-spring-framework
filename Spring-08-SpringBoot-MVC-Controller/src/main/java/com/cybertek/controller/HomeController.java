package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping ("/")
    public String getRequestMapping(){
        return "home"; //shows which template it will show - MVC View
    }

    //retrieve data
    @RequestMapping (method = RequestMethod.GET, value = "/ozzy")

    public String getRequestMapping1(){
        return "home"; //shows which template it will show - MVC View
    }

    //post, publish data
    @RequestMapping (method = RequestMethod.POST, value = "/cybertek")
    public String getRequestMapping2(){
        return "home"; //shows which template it will show - MVC View
    }


    @GetMapping("/spring")
    public String getMappingEx(){
        return "home";
    }

    @PostMapping("/spring")
    public String getMappingEx1(){
        return "home";
    }

    //@PathVariable
    @GetMapping("/home/{name}")
    public String getVariableEx(@PathVariable("name") String name){
        System.out.println("name is "+ name);
        return "home";
    }

    @GetMapping("/home/{name}{email}")
    public String getVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email){
        System.out.println("name is "+ name);
        System.out.println("email is "+ email);
        return "home";
    }

    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course")String course){
        System.out.println("course is "+ course);
        return "home";
    }

    @GetMapping(value="/course2")
    public String requestParam2(@RequestParam(value="course2", required = false, defaultValue = "Cybertek")String name){
        System.out.println("name is "+ name);
        return "home";
    }
}
