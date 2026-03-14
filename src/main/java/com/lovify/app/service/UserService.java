package com.lovify.app.service;

import com.lovify.app.dto.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
