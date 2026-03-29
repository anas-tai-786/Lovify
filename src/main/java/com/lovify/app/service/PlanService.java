package com.lovify.app.service;

import com.lovify.app.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
