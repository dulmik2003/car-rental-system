package com.cypsoLabs.car_rental_sev.repository;

import com.cypsoLabs.car_rental_sev.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String roleName);
}
