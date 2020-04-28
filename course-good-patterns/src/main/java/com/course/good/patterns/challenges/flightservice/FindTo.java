package com.course.good.patterns.challenges.flightservice;

import java.util.List;
import java.util.stream.Collectors;

public class FindTo implements Finder {

    @Override
    public List<Flight> find(FlightList flightList, FindConditions findConditions) {

        return flightList.getFlightSet().stream()
                .filter(flight -> flight.getArrivalAirport().equals(findConditions.getArrAirport()))
                .collect(Collectors.toList());

    }
}
