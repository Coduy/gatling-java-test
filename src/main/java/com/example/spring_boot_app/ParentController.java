package com.example.spring_boot_app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ParentController {
    
    @GetMapping("/api/example")
    public String displayData() {
        String message = "helloWorld";
        return message;
    }
}