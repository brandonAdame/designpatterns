package com.brandon.designpatterns.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Route executeStrategy(RouteRequest request) {
        return strategy.execute(request);
    }
}
