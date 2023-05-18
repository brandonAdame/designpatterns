package com.brandon.designpatterns.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SetAddressCommand implements Command {

    @Override
    public void execute(ClientProfile clientProfile) {
        log.info("Setting client address");
        clientProfile.setAddress("123 Coder Lane Cary, NC 27519");
    }
}
