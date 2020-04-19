package com.course.exception.test;

public class FlightFinderTest {

    public static void main(String[] args) {

        Flight flight = new Flight("Airport 2", "Airport 8");
        FlightFinder flightFinder = new FlightFinder();

        try {
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport doesn't exist " + e);
        }finally {
            System.out.println("Thanks for using our finder");
        }

    }
}
