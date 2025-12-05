package com.campuslink.cl.Controller;

import com.campuslink.cl.DTO.LoginRequest;
import com.campuslink.cl.DTO.SignUpRequest;
import com.campuslink.cl.Entity.User;
import com.campuslink.cl.Service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@Valid @RequestBody SignUpRequest request) {
        User user = authService.register(request);
        // For security, don't return passwordHash
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "id", user.getUserId(),
                "email", user.getEmail(),
                "name", user.getName(),
                "role", user.getRole()
        ));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest request) {
        String token = authService.login(request);

        return ResponseEntity.ok(Map.of(
                "token", token,
                "message", "Login successful"
        ));
    }

}
