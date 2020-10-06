package com.poc.gcpappenginedemo.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class AppController {
   @Value("${message}")
   String message;
   
   @GetMapping(value="/", produces = MediaType.TEXT_PLAIN_VALUE)
   public String index() {

       return "This is Home page";
   }
   
   @GetMapping(value = "demo", produces = MediaType.TEXT_PLAIN_VALUE)
   public ResponseEntity<String> displayHelloMessage() {
      return ResponseEntity.ok(message);
   }
}