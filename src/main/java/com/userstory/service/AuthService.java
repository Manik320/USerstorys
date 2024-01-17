package com.userstory.service;

import com.userstory.dto.LoginRequest;
import com.userstory.dto.RegistrationRequest;

public interface AuthService {
    String registerUser(RegistrationRequest registrationRequest);
    String loginUser(LoginRequest loginRequest);
}
