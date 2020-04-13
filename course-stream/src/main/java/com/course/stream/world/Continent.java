package com.course.stream.world;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {

    private final String continent;
    private final Set<Country> countryList = new HashSet<>();

    public Continent(final String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public Set<Country> getCountryList() {
        return countryList;
    }
}
