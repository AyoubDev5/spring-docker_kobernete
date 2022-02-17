package com.springdockerkobernete.springdocker_kobernete.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String getHello(){
        return "Hello my name is Ayoub Taqi";
    }
}
