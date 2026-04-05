package com.lovify.app.service.impl;

import com.lovify.app.dto.auth.UserProfileResponse;
import com.lovify.app.dto.subscription.PlanLimitsResponse;
import com.lovify.app.dto.subscription.UsageTodayResponse;
import com.lovify.app.service.UsageService;
import com.lovify.app.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
