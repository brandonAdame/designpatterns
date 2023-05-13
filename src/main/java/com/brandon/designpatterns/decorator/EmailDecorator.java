package com.brandon.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailDecorator extends BaseDecorator {
    public EmailDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(Message message) {
        super.sendMessage(message);
        log.info("Sending message via Email | {}", message);
    }
}
