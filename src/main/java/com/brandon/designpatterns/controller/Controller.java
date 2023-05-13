package com.brandon.designpatterns.controller;

import com.brandon.designpatterns.decorator.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(path = "/decorator", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> decorator(@RequestBody Message message) {
        Notifier notifier = new SMSDecorator(new EmailDecorator(new ConcreteNotifier()));
        notifier.sendMessage(message);

        return ResponseEntity.ok("OK");
    }
}
