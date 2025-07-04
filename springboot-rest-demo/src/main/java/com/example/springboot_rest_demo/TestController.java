package com.example.springboot_rest_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * A simple endpoint that returns a greeting message.
     * @return String greeting message
     */
    @GetMapping("/greet")
    public String greet() {
        return "Hello, welcome to the Spring Boot REST demo!";
    }
}
