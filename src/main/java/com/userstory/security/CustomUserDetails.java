package com.userstory.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

import java.util.Collection;

@Data

public class CustomUserDetails implements UserDetails {

    private String username;
    private String password;

    // Implement the method to get authorities (roles)
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // You should implement this method to return a collection of authorities (roles) for the user.
        // Example: return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
        return null;
    }

    // Implement the method to check if the account is not expired
    @Override
    public boolean isAccountNonExpired() {
        // You should implement this method to check if the user account is not expired.
        // Example: return true if the account is not expired, false otherwise.
        return true;
    }

    // Implement the method to check if the account is not locked
    @Override
    public boolean isAccountNonLocked() {
        // You should implement this method to check if the user account is not locked.
        // Example: return true if the account is not locked, false otherwise.
        return true;
    }

    // Implement the method to check if the credentials are not expired
    @Override
    public boolean isCredentialsNonExpired() {
        // You should implement this method to check if the user credentials are not expired.
        // Example: return true if the credentials are not expired, false otherwise.
        return true;
    }

    // Implement the method to check if the user is enabled
    @Override
    public boolean isEnabled() {
        // You should implement this method to check if the user is enabled.
        // Example: return true if the user is enabled, false otherwise.
        return true;
    }

    // Constructors, getters, and other UserDetails methods
}
