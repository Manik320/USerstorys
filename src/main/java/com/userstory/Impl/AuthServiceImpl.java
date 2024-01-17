package com.userstory.Impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.userstory.dto.LoginRequest;
import com.userstory.dto.RegistrationRequest;
import com.userstory.model.User;
import com.userstory.service.AuthService;
import com.userstory.service.UserService;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String registerUser(RegistrationRequest registrationRequest) {
        // Check if the username or email is already registered
        if (userService.existsByUsername(registrationRequest.getUsername())) {
            return "Username is already taken";
        }

        if (userService.existsByEmail(registrationRequest.getEmail())) {
            return "Email is already registered";
        }

        // Create a new user entity and set its properties
        User newUser = new User();
        newUser.setUsername(registrationRequest.getUsername());
        newUser.setEmail(registrationRequest.getEmail());
        // Encrypt the password before saving it to the database
        newUser.setPassword(passwordEncoder.encode(registrationRequest.getPassword()));

        // Add additional logic, such as assigning roles, if needed
        // newUser.setRoles(someRoleSet);

        // Save the user to the database
        userService.save(newUser);

        return "User registered successfully";
    }

    @Override
    public String loginUser(LoginRequest loginRequest) {
        // Retrieve user by username
        User user = userService.findByUsername(loginRequest.getUsername());

        // Check if the user exists and the password matches
        if (user != null && passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
            // Implement logic to generate and return a JWT token
            // Example: return jwtTokenProvider.generateToken(user);
            return "Login successful";
        } else {
            return "Invalid username or password";
        }
    }
}
