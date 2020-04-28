package com.course.good.patterns.challenges.flightservice;

public class FindConditionsRetrieve {

    public FindConditions getConditions(){
        String departureAirport = "Warsaw";
        String arrivalsAirport = "Poznan";
        Finder find = new FindThrough();

        return new FindConditions(departureAirport, arrivalsAirport, find);
    }
}
