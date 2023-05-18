package com.brandon.designpatterns.controller;

import com.brandon.designpatterns.command.ClientProfile;
import com.brandon.designpatterns.command.CommandInvoker;
import com.brandon.designpatterns.decorator.*;
import com.brandon.designpatterns.strategy.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    CommandInvoker commandInvoker;

    public Controller(CommandInvoker commandInvoker) {
        this.commandInvoker = commandInvoker;
    }

    @GetMapping(path = "/decorator", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<String> decorator(@RequestBody Message message) {
        Notifier notifier = new SMSDecorator(new EmailDecorator(new ConcreteNotifier()));
        notifier.sendMessage(message);

        return ResponseEntity.ok("OK");
    }

    @GetMapping(path = "/strategy", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<Route> strategy(@RequestBody RouteRequest request) {
        Context context = new Context();
        if (request.getAction().equals("walking"))
            context.setStrategy(new WalkingStrategy());
        else
            context.setStrategy(new DrivingStrategy());

        var result = context.executeStrategy(request);
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/command", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ClientProfile> command(@RequestBody ClientProfile clientProfile) {
        commandInvoker.execute(clientProfile);

        return ResponseEntity.ok(clientProfile);
    }
}
