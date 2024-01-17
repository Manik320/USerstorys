package com.userstory.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userstory.model.User;
import com.userstory.repository.UserRepository;
import com.userstory.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByUsername(String username) {
        // Implement finding a user by username
        return userRepository.findByUsername(username);
    }

    @Override
    public void save(User newUser) {
        // Implement saving a new user to the database
        userRepository.save(newUser);
    }

    @Override
    public boolean existsByUsername(String username) {
        // Implement checking if a user with the given username exists
        return userRepository.existsByUsername(username);
    }

    @Override
    public boolean existsByEmail(String email) {
        // Implement checking if a user with the given email exists
        return userRepository.existsByEmail(email);
    }
}
