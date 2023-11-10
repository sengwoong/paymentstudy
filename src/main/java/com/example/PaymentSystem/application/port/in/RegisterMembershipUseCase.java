package com.example.PaymentSystem.application.port.in;

import com.example.PaymentSystem.application.domain.Membership;


public interface RegisterMembershipUseCase {

    void registerMembership(RegisterMembershipCommand command);
//    void registerAxonMembership(RegisterMembershipCommand command);
}

