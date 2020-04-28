package com.course.good.patterns.challenges.flightservice;

import java.util.List;

public class FindProcess {

    private Finder finder;

    public FindProcess(Finder finder) {
        this.finder = finder;
    }

    public void process(FlightList flightList, FindConditions findConditions){

       List<Flight> result = finder.find(flightList, findConditions);
        System.out.println(result);
    }
}
