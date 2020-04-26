package com.course.good.patterns.challenges.flightservice;

public class FindProcess {

    private Finder finder;

    public FindProcess(Finder finder) {
        this.finder = finder;
    }

    public void process(FlightList flightList, FindConditions findConditions){

        finder.find(flightList, findConditions);

    }
}
