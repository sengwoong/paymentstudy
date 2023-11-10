package com.example.PaymentSystem.application.service;

import com.example.PaymentSystem.application.domain.Membership;
import com.example.PaymentSystem.application.port.in.RegisterMembershipCommand;
import com.example.PaymentSystem.application.port.in.RegisterMembershipUseCase;
import common.UseCase;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.axonframework.commandhandling.gateway.CommandGateway;
import com.example.PaymentSystem.application.port.out.RegisterMembershipPort;



@RequiredArgsConstructor
@UseCase
@Transactional
public class RegisterMembership implements RegisterMembershipUseCase {

    private final RegisterMembershipPort rport;
//    private final CommandGateway commandGateway;

    @Override
    public void registerMembership(RegisterMembershipCommand command) {
        rport.createMembership(
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsValid(command.isValid()),
                new Membership.MembershipAggregateIdentifier("default")
        );
    }
//    @Override
//    public void registerAxonMembership(RegisterMembershipCommand command) {
//        commandGateway.send(command)
//                .whenComplete((Object result, Throwable throwable) -> {
//                    if (throwable == null) {
//                        System.out.println("Aggregate ID:" + result.toString());
//                        rport.createMembership(
//                                new Membership.MembershipName(command.getName()),
//                                new Membership.MembershipEmail(command.getEmail()),
//                                new Membership.MembershipAddress(command.getAddress()),
//                                new Membership.MembershipIsValid(command.isValid()),
//                                new Membership.MembershipAggregateIdentifier(result.toString())
//                        );
//                    }
//                    else{
//                        System.out.println("error : " + throwable.getMessage());
//                    }
//                });
//    }
}




