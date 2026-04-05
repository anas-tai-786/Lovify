package com.lovify.app.service.impl;

import com.lovify.app.dto.subscription.CheckoutRequest;
import com.lovify.app.dto.subscription.CheckoutResponse;
import com.lovify.app.dto.subscription.PortalResponse;
import com.lovify.app.dto.subscription.SubscriptionResponse;
import com.lovify.app.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
