package com.bank.auth_service.controller;



import com.bank.auth_service.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bank.auth_service.model.User;
import com.bank.auth_service.service.AuthService;



@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService service;

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User validUser =
                service.validate(user.getUsername(), user.getPassword());

        if (validUser != null) {
            return JwtUtil.generateToken(user.getUsername());
        }

        return "Invalid credentials";
    }
}
