package com.userstory.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;

    // Getters and setters
}
