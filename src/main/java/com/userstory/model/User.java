package com.userstory.model;


import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String email;

    @ManyToMany
    private Set<Role> roles;

    // Getters and setters
}
