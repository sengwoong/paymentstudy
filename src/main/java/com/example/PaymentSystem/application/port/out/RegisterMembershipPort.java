package com.example.PaymentSystem.application.port.out;



import com.example.PaymentSystem.application.domain.Membership;


public interface RegisterMembershipPort {

    void createMembership(
            Membership.MembershipName membershipName
            , Membership.MembershipEmail membershipEmail
            , Membership.MembershipAddress membershipAddress
            , Membership.MembershipIsValid membershipIsValid
            , Membership.MembershipAggregateIdentifier membershipAggregateIdentifier
    );
}
