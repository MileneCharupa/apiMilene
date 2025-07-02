package com.primeiraapi.apirest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estado")
public class Principal {
    @GetMapping
    public String metodo1(){
        return "Estado Online";
    }
    
}
