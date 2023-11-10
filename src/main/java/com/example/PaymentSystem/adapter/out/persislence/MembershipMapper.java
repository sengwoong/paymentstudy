package com.example.PaymentSystem.adapter.out.persislence;

import com.example.PaymentSystem.application.domain.Membership;
import org.springframework.stereotype.Component;




@Component
class MembershipMapper {
    Membership mapToDomainEntity(
            MembershipJpaEntity membership) {
        System.out.println(membership.toString());
        return Membership.generateMember(
                new Membership.MembershipId(membership.getMembershipId()+""),
                new Membership.MembershipName(membership.getName()),
                new Membership.MembershipEmail(membership.getEmail()),
                new Membership.MembershipAddress(membership.getAddress()),
                new Membership.MembershipIsValid(membership.isValid()),
                new Membership.MembershipAggregateIdentifier(membership.getAggregateIdentifier())
        );
    }
}
