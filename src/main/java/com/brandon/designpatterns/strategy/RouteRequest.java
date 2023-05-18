package com.brandon.designpatterns.strategy;

import lombok.Data;

@Data
public class RouteRequest {
    String desiredStart, desiredEnd, action;
}
