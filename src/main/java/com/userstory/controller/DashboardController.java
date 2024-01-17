package com.userstory.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.userstory.security.CustomUserDetails;


//DashboardController.java
@Controller
@RequestMapping("/dashboard")
public class DashboardController {

 @GetMapping
 public String dashboard(Model model, @AuthenticationPrincipal CustomUserDetails userDetails) {
     model.addAttribute("username", userDetails.getUsername());
     // Add more attributes or fetch additional information from the database as needed
     return "dashboard";
 }
}

