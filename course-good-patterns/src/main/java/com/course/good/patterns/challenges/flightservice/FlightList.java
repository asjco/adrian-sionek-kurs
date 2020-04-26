package com.course.good.patterns.challenges.flightservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightList {

    private Map<String, List<String>> flightMap = new HashMap<>();

    public FlightList() {
        flightMap.put("1", new Flight1().airportsList());

    }

    public Map<String, List<String>> getFlightMap() {
        return flightMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightList that = (FlightList) o;

        return flightMap.equals(that.flightMap);
    }

    @Override
    public int hashCode() {
        return flightMap.hashCode();
    }
}
