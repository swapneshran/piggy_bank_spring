package com.example.piggy_bank_spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping("/")
    ResponseEntity<String> getHelloWorld(){
        return ResponseEntity.of(Optional.of("Hello World"));
    }
}
