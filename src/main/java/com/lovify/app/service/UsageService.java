package com.lovify.app.service;

import com.lovify.app.dto.subscription.PlanLimitsResponse;
import com.lovify.app.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
