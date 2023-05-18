package com.brandon.designpatterns.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SetOccupationCommand implements Command {
    @Override
    public void execute(ClientProfile clientProfile) {
        log.info("Setting client occupation");
        clientProfile.setOccupation("Software Engineer");
    }
}
