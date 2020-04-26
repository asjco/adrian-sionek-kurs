package com.course.good.patterns.challenges.flightservice;

public class FindConditions {

    private String airport;
    private Finder finder;

    public FindConditions(String airport, Finder finder) {
        this.airport = airport;
        this.finder = finder;
    }

    public String getAirport() {
        return airport;
    }

    public Finder getFinder() {
        return finder;
    }
}
