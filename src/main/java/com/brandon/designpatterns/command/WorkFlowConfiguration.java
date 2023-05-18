package com.brandon.designpatterns.command;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
public class WorkFlowConfiguration {
    @Value("#{${work-flow-commands}}")
    public Map<String, List<String>> workFlowCommands;
}
