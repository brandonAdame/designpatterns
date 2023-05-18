package com.brandon.designpatterns.strategy;

public class WalkingStrategy implements Strategy {
    @Override
    public Route execute(RouteRequest request) {
        Route route = new Route();
        route.setStartPoint("Cary, NC");
        route.setEndPoint("Knightdale, NC");

        return route;
    }
}
