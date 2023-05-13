package com.brandon.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SMSDecorator extends BaseDecorator {

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(Message message) {
        super.sendMessage(message);
        log.info("Sending message via SMS | {}", message);
    }
}
