package com.example.PaymentSystem.adapter.out.persislence;

import org.springframework.data.jpa.repository.JpaRepository;

interface SpringDataMembershipRepository extends JpaRepository<MembershipJpaEntity, Long> {
}

