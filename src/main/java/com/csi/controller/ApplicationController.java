package com.csi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> sayWelcome(){
        return ResponseEntity.ok("hello from TCS");
    }


    @GetMapping("/companyname")
    public  String company(){
        return "TCS AS IT IS";
    }
}
