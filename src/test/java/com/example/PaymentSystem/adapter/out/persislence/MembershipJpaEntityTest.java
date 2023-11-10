package com.example.PaymentSystem.adapter.out.persislence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MembershipJpaEntityTest {

    @Test
    void testToString() {
        MembershipJpaEntity membership = new MembershipJpaEntity("John Doe", "123 Main St", "johndoe@example.com", true, "AGGREGATE-123");
        String expectedString = "MembershipJpaEntity{" +
                "membershipId=" + membership.getMembershipId() +
                ", name='" + membership.getName() + '\'' +
                ", address='" + membership.getAddress() + '\'' +
                ", email='" + membership.getEmail() + '\'' +
                ", isValid=" + membership.isValid() +
                ", aggregateIdentifier='" + membership.getAggregateIdentifier() + '\'' +
                '}';
        assertEquals(expectedString, membership.toString());
    }
}
