package com.lovify.app.service;

import com.lovify.app.dto.auth.AuthResponse;
import com.lovify.app.dto.auth.LoginRequest;
import com.lovify.app.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
