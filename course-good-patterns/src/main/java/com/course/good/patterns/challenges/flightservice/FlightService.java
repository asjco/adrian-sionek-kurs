package com.course.good.patterns.challenges.flightservice;

public class FlightService {
    public static void main(String[] args) {
        FlightList flightList = new FlightList();
        FindConditionsRetrieve findConditionsRetrieve = new FindConditionsRetrieve();
        FindProcess findProcess = new FindProcess(findConditionsRetrieve.getConditions().getFinder());
        findProcess.process(flightList, findConditionsRetrieve.getConditions());

    }
}
