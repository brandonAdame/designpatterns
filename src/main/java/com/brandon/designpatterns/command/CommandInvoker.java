package com.brandon.designpatterns.command;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Component
public class CommandInvoker {

    private final Map<String, Command> commandMap;
    private final WorkFlowConfiguration configuration;

    public CommandInvoker(List<Command> commands, WorkFlowConfiguration configuration) {
        this.configuration = configuration;
        this.commandMap = commands
                .stream()
                .collect(Collectors.toMap(command -> command.getClass().getSimpleName(), Function.identity()));
    }

    public ClientProfile execute(ClientProfile clientProfile) {
        if (configuration.getWorkFlowCommands().containsKey(clientProfile.getType())) {
            for (String commandName : configuration.getWorkFlowCommands().get(clientProfile.getType())) {
                Command command = commandMap.get(commandName);
                command.execute(clientProfile);
            }
            return clientProfile;
        }
        return null;
    }
}
