package com.example.springboot_rest_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/greet")
    public String greet() {
        return "Hello, welcome to the Spring Boot REST demo!";
    }
}
