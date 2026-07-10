package com.codingshuttle.projects.lovable_clone.service;

import com.codingshuttle.projects.lovable_clone.dto.subscription.CheckoutRequest;
import com.codingshuttle.projects.lovable_clone.dto.subscription.CheckoutResponse;
import com.codingshuttle.projects.lovable_clone.dto.subscription.PortalResponse;

public interface PaymentProcessor {
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    public PortalResponse openCustomerPortal();
    }
