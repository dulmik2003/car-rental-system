package com.cypsoLabs.car_rental_sev.controller;

import com.cypsoLabs.car_rental_sev.dto.AuthenticationRequest;
import com.cypsoLabs.car_rental_sev.dto.AuthenticationResponse;
import com.cypsoLabs.car_rental_sev.dto.RegisterRequest;
import com.cypsoLabs.car_rental_sev.service.AuthenticationService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.ACCEPTED;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@Tag(name = "Authentication")
public class AuthenticationController {
    private final AuthenticationService authService;

    @PostMapping("/register")
    @ResponseStatus(ACCEPTED)
    public ResponseEntity<?> register(@RequestBody @Valid RegisterRequest request) throws MessagingException {
        authService.register(request);
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/authenticate")
    @ResponseStatus(ACCEPTED)
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody @Valid AuthenticationRequest request) {
        return ResponseEntity.ok(authService.authenticate(request));
    }

    @GetMapping("/activate-account")
    @ResponseStatus(ACCEPTED)
    public void activateAccount(@RequestParam String token) throws MessagingException {
        authService.activateAccount(token);
    }
}
