package com.course.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String country;
    private final BigDecimal PeopleQuantity;

    public Country(final String country, final BigDecimal peopleQuantity) {
        this.country = country;
        this.PeopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country='" + country + '\'' +
                ", PeopleQuantity=" + PeopleQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country1 = (Country) o;

        return country.equals(country1.country);
    }


}
