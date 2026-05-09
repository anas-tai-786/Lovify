package com.lovify.app.dto.auth;

public record UserProfileResponse(
        Long id,
        String username,
        String name
) {
}
