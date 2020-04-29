package com.course.good.patterns.challenges.flightservice;

import java.util.HashSet;
import java.util.Set;

public class FlightList {

    private Set<Flight> flightSet = new HashSet<>();

    public FlightList() {
        flightSet.add(new Flight("Warsaw", "Poznan"));
        flightSet.add(new Flight("Krakow", "Warsaw"));
        flightSet.add(new Flight("Warsaw", "Krakow"));
        flightSet.add(new Flight("Krakow", "Poznan"));
        flightSet.add(new Flight("Krakow", "Gdansk"));
        flightSet.add(new Flight("Gdansk", "Poznan"));
        flightSet.add(new Flight("Lublin", "Poznan"));
        flightSet.add(new Flight("Lublin", "Poznan"));
        flightSet.add(new Flight("Warsaw", "Lublin"));
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }


}
