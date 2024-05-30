package com.cypsoLabs.car_rental_sev.repository;

import com.cypsoLabs.car_rental_sev.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {
    Optional<Token> findByToken(String token);
}
