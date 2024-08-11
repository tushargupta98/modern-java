package com.tushar.modernjava.service.lambdas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

@Service
public class ConsumerService {

    public void printStrings(List<String> input){
        Consumer<String> printStrings = System.out :: println;
        input.forEach(printStrings);
    }
    public void printIntegers(List<Integer> input){
        Consumer<Integer> printIntegers = (i)->{
            System.out.println(i*3);
        };
        input.forEach(printIntegers);
    }

}
