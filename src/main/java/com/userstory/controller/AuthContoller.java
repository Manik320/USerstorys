package com.userstory.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userstory.dto.LoginRequest;
import com.userstory.dto.RegistrationRequest;
import com.userstory.service.AuthService;

 
//AuthController.java
@RestController
@CrossOrigin(origins = "http://localhost:8585")
@RequestMapping("/api/auth")
public class AuthContoller {

 @Autowired
 private AuthService authService;

 @PostMapping("/register")
 public ResponseEntity<String> registerUser(@RequestBody RegistrationRequest registrationRequest) {
     String result = authService.registerUser(registrationRequest);
     return ResponseEntity.ok(result);
 }

 @PostMapping("/login")
 public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
     String result = authService.loginUser(loginRequest);
     return ResponseEntity.ok(result);
 }
}



