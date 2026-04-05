package com.lovify.app.service.impl;

import com.lovify.app.dto.subscription.PlanResponse;
import com.lovify.app.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
