package com.usp.banking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/health-check")
    public ResponseEntity<?> healhcheck(){
        return new ResponseEntity("up and running",HttpStatus.OK);
    }
}
