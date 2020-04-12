package com.course.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent continent1 = new Continent("Africa");
        Continent continent2 = new Continent("Asia");
        Continent continent3 = new Continent("Europe");

        Country country1 = new Country("Uganda", new BigDecimal("64217812"));
        Country country2 = new Country("Singapore", new BigDecimal("84511278"));
        Country country3 = new Country("Taiwan", new BigDecimal("99171278"));
        Country country4 = new Country("Poland", new BigDecimal("42174812"));
        Country country5 = new Country("Italy", new BigDecimal("647748128"));
        Country country6 = new Country("Russia", new BigDecimal("578648128"));
        Country country7 = new Country("Arab Emirates", new BigDecimal("366141270"));


        //When
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        continent1.addCountry(country1);
        continent1.addCountry(country7);

        continent2.addCountry(country2);
        continent2.addCountry(country3);

        continent3.addCountry(country4);
        continent3.addCountry(country5);
        continent3.addCountry(country6);

        BigDecimal allPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expectedQuantity = new BigDecimal("1882612706");
        Assert.assertEquals(expectedQuantity, allPeople);

    }
}
