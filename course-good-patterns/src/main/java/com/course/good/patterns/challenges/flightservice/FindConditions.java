package com.course.good.patterns.challenges.flightservice;

public class FindConditions {

    private String depAirport;
    private String arrAirport;
    private Finder finder;

    public FindConditions(String depAirport, String arrAirport, Finder finder) {
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
        this.finder = finder;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getArrAirport() {
        return arrAirport;
    }

    public Finder getFinder() {
        return finder;
    }
}
