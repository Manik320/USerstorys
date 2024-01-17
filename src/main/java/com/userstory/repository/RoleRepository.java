package com.userstory.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.userstory.model.Role;



public interface RoleRepository extends JpaRepository<Role, Long> {
}
