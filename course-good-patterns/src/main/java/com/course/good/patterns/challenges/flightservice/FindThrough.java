package com.course.good.patterns.challenges.flightservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindThrough implements Finder {

    @Override
    public List<Flight> find(FlightList flightList, FindConditions findConditions) {

        List<Flight> result = new ArrayList<>();

        String arrCond = findConditions.getArrAirport();
        String depCond = findConditions.getDepAirport();

        for (Flight flight : flightList.getFlightSet()) {
            if (flight.getDepartureAirport().equals(depCond)) {

                for (Flight flight2 : flightList.getFlightSet()) {
                    if (flight2.getArrivalAirport().equals(arrCond) && !(flight2.equals(flight)) && flight2.getDepartureAirport().equals(flight.getArrivalAirport())) {
                        result.add(flight);
                        result.add(flight2);
                    }
                }
            }
        }
        return result;
    }

}
