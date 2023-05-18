package com.brandon.designpatterns.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SetCompanyCommand implements Command {
    @Override
    public void execute(ClientProfile clientProfile) {
        log.info("Setting client company");
        clientProfile.setCompany("Fidelity Investments");
    }
}
