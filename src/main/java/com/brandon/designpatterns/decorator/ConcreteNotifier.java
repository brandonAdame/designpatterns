package com.brandon.designpatterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteNotifier implements Notifier {

    @Override
    public void sendMessage(Message message) {
        log.info("Sending mandatory message to B2B service | {}", message);
    }
}
