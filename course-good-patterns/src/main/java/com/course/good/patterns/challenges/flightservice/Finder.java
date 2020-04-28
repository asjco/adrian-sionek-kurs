package com.course.good.patterns.challenges.flightservice;

import java.util.List;

public interface Finder {

    public List<Flight> find(FlightList flightList, FindConditions findConditions);
}
