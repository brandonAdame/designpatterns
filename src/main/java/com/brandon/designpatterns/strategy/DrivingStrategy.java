package com.brandon.designpatterns.strategy;

public class DrivingStrategy implements Strategy {
    @Override
    public Route execute(RouteRequest request) {
        Route route = new Route();
        route.setStartPoint("Cary, NC");
        route.setEndPoint("Greenville, NC");

        return route;
    }
}
