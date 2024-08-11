package com.tushar.modernjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Health {

    @GetMapping("/health")
    public String getHealth(){
        return "OK";
    }
}
