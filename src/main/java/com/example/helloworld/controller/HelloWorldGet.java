package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class HelloWorldGet {
    @GetMapping("/helllo")
    public String sayHello(){
        return "Hello from BridgeLabz";
    }
}
