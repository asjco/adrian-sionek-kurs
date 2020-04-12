package com.course.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}
