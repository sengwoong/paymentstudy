package com.example.PaymentSystem.adapter.out.persislence;

import com.example.PaymentSystem.application.domain.Membership;
import com.example.PaymentSystem.application.port.out.RegisterMembershipPort;
import common.PersistenceAdapter;
import lombok.RequiredArgsConstructor;




@RequiredArgsConstructor
@PersistenceAdapter
class MembershipPersistenceAdapter implements RegisterMembershipPort {

    private final SpringDataMembershipRepository membershipRepository;
    private final MembershipMapper membershipMapper;

    @Override
    public void createMembership(Membership.MembershipName membershipName
            , Membership.MembershipEmail membershipEmail
            , Membership.MembershipAddress membershipAddress
            , Membership.MembershipIsValid membershipIsValid
            , Membership.MembershipAggregateIdentifier membershipAggregateIdentifier
    ) {
        membershipRepository.save(
                new MembershipJpaEntity(
                        membershipName.getNameValue(),
                        membershipEmail.getEmailValue(),
                        membershipAddress.getAddressValue(),
                        membershipIsValid.isValidValue(),
                        membershipAggregateIdentifier.getAggregateIdentifier()
                )
        );
    }

//    @Override
//    public Membership findMembership(Membership.MembershipId membershipId) {
//        return membershipMapper.mapToDomainEntity(
//                membershipRepository.getById(Long.parseLong(membershipId.getMembershipId()))
//        );
//    }

//    @Override
//    public Membership updateMembership(Membership.MembershipId membershipId, Membership.MembershipName membershipName, Membership.MembershipEmail membershipEmail, Membership.MembershipAddress membershipAddress, Membership.MembershipIsValid membershipIsValid) {
//        // update membership Info
//        MembershipJpaEntity membershipJpaEntity = membershipRepository.getById(Long.parseLong(membershipId.getMembershipId()));
//        membershipJpaEntity.setName(membershipName.getNameValue());
//        membershipJpaEntity.setEmail(membershipEmail.getEmailValue());
//        membershipJpaEntity.setAddress(membershipAddress.getAddressValue());
//        membershipJpaEntity.setValid(membershipIsValid.isValidValue());
//
//        // save
//        MembershipJpaEntity updatedMembership = membershipRepository.save(membershipJpaEntity);
//
//        // return
//        return membershipMapper.mapToDomainEntity(updatedMembership);
//    }
}
