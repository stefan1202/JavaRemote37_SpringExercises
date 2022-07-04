package com.example.ex8;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    @GetMapping("/api/random-boolean")
    public Boolean randomValue(){
        return randomBooleanProvider.getValue();
    }
    @Autowired
    RandomBooleanProvider randomBooleanProvider;

}
