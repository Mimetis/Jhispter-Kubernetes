package com.mycompany.myapp.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IsbnResource {

    @GetMapping("/isbn")
    public String generateIsbnNumber() {
        return "ISBN-" + Math.random();
    }
}
