package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // Usa @Controller en lugar de @RestController





public class holaspring {

    @GetMapping("/hello")
    public String hello(){
        return "hello"
    }
    
}
