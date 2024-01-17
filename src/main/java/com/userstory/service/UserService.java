package com.userstory.service;

import com.userstory.model.User;

public interface UserService {
    User findByUsername(String username);

	void save(User newUser);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);

	
}
