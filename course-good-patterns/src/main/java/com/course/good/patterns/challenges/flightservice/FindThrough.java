package com.course.good.patterns.challenges.flightservice;

import java.util.List;
import java.util.stream.Collectors;

public class FindThrough implements Finder {

    @Override
    public List<Flight> find(FlightList flightList, FindConditions findConditions) {

        return flightList.getFlightSet().stream()
                .filter(flight -> flight.getDepartureAirport().equals(findConditions.getDepAirport()) || flight.getArrivalAirport().equals(findConditions.getArrAirport()))
                .filter(flight -> !(flight.getDepartureAirport().equals(findConditions.getDepAirport()) && flight.getArrivalAirport().equals(findConditions.getArrAirport())))
                // brakuje porównania lotniska odlotu dla każdego elementu z lotniskiem przylotu pozostałych elementów
                // np. dla połączenia 'Warsaw - Krakow' i 'Krakow-Poznan' chcę porównać czy lotnisko pośrednie jest to samo
                .collect(Collectors.toList());

    }

}
