package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/home")
    public ResponseEntity<String> home() {
      String msg = "Probando servicio Render.com";
      return ResponseEntity.ok(msg);
    }
}
