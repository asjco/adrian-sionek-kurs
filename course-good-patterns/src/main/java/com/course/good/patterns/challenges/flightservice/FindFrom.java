package com.course.good.patterns.challenges.flightservice;

public class FindFrom implements Finder {

    @Override
    public void find(FlightList flightList, FindConditions findConditions) {

        long flightsQuantity = flightList.getFlightMap().values().stream()
                .flatMap(l -> l.stream())
                .filter(o -> o.equals(findConditions.getAirport()))
                .count();

        System.out.println(flightsQuantity);
    }
}
