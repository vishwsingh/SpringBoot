package com.genspark.SpringBootDemoApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Welcome to the Spring Boot Demo</H1><HTML>";
    }
}
