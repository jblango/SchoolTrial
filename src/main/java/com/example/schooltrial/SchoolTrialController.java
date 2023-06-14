package com.example.schooltrial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SchoolTrialController {
    @GetMapping("/")
    public String helloWorld(){
        //return "Hello World from Spring Boot";
        return "index";
    }
}
