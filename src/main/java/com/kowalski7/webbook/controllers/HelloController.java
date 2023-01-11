package com.kowalski7.webbook.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    public HelloController() {

    }

    @GetMapping("/hello")
    public String sayHi() {
        return "<h1 style='text-align: center'>Hello from Spring Boot!</h1>";
    }
}
