package com.lovify.app.service.impl;

import com.lovify.app.dto.auth.AuthResponse;
import com.lovify.app.dto.auth.LoginRequest;
import com.lovify.app.dto.auth.SignupRequest;
import com.lovify.app.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
