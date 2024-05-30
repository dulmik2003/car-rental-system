package com.cypsoLabs.car_rental_sev.repository;

import com.cypsoLabs.car_rental_sev.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
