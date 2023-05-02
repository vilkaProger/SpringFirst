package ru.klassen.springmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {


    @RequestMapping("/hello")
    public String helloPage() {
        return "first/hello";
    }

    @RequestMapping("/goodbye")
    public String goodbyePage() {
        return "first/goodbye";
    }
}
