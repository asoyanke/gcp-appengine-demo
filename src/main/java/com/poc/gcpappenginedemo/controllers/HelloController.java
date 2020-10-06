package com.poc.gcpappenginedemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class HelloController {
   @Value("${message}")
   String message;   
   @GetMapping(value = "demo")
   public ResponseEntity<String> displayHelloMessage() {
      return ResponseEntity.ok(message);
   }
}