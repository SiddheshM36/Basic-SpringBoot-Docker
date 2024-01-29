package com.springdocker.springdocker.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/users")
    public String getHomePage() {
        return "Hey siddhesh";
    }
    
}
