package com.brandon.designpatterns.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SetEmploymentCommand implements Command {
    @Override
    public void execute(ClientProfile clientProfile) {
        log.info("Setting employed to true");
        clientProfile.setEmployed(true);
    }
}
