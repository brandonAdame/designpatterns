package com.brandon.designpatterns.command;

import lombok.Data;

@Data
public class ClientProfile {
    String name, address, occupation, company, type;
    boolean isEmployed;
}
