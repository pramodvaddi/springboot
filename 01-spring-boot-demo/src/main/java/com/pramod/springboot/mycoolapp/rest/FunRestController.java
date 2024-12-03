package com.pramod.springboot.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Expose "/" that returns "Hello World"
    @GetMapping("/")
    public String HelloWorld(){
        return "Hello World";
    }
}