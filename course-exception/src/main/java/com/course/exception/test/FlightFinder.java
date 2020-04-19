package com.course.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Airport 1", true);
        airports.put("Airport 2", true);
        airports.put("Airport 3", true);
        airports.put("Airport 4", true);
        airports.put("Airport 5", true);

        if (!airports.containsKey(flight.getDepartureAirport()) || !airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        } else {
            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is possible");
        }
    }
}
