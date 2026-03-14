package com.lovify.app.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
