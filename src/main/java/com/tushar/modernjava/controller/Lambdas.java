package com.tushar.modernjava.controller;

import com.tushar.modernjava.service.lambdas.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Lambdas {

    ConsumerService consumerService;

    @Autowired
    public Lambdas(ConsumerService consumerService){
        this.consumerService = consumerService;
    }
    @PostMapping("/lambdas/strings")
    public String processStringInput(@RequestBody List<String> input){
        consumerService.printStrings(input);
        return "Success";
    }

    @PostMapping("/lambdas/integers")
    public String processIntegerInput(@RequestBody List<Integer> input){
        consumerService.printIntegers(input);
        return "Success";
    }
}
