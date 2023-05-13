package com.brandon.designpatterns.decorator;


public class BaseDecorator implements Notifier {

    private final Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMessage(Message message) {
        notifier.sendMessage(message);
    }
}
