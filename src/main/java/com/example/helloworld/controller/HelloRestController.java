package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloRestController {
    @RequestMapping("/")
    public String index(){
        return "Hello from BridgeLabz";
    }
}
