package com.example.springboot_rest_demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Test API Swagger dashboard",
                version = "1.0",
                description = "API documentation for test REST API"
        )
)

/**
 * Main application class for the Spring Boot REST demo.
 * This class serves as the entry point for the application.
 */
public class SpringbootRestDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestDemoApplication.class, args);
    }
}