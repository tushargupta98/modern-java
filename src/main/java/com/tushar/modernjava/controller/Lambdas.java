package com.tushar.modernjava.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Lambdas {

    @PostMapping("/lambdas/strings")
    public String processStringInput(@RequestBody List<String> input){

        return input.toString();
    }

    @PostMapping("/lambdas/integers")
    public String processIntegerInput(@RequestBody List<Integer> input){

        return input.toString();
    }
}
