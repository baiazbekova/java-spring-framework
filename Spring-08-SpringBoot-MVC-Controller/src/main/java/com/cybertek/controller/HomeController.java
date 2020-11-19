package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

}
