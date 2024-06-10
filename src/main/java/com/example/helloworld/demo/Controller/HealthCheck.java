package com.example.helloworld.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Ok";
    }
}
