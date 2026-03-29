package com.lovify.app.service;

import com.lovify.app.dto.subscription.CheckoutRequest;
import com.lovify.app.dto.subscription.CheckoutResponse;
import com.lovify.app.dto.subscription.PortalResponse;
import com.lovify.app.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
