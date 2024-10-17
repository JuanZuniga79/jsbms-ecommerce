package com.example.userservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class Root {

    @GetMapping
    public ResponseEntity<String> root() {
        return ResponseEntity.ok("Hello World");
    }

}
