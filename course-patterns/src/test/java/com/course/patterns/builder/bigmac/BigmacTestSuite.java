package com.course.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BigmacTestSuite {

    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("normal")
                .sauce("barbecue")
                .burgers(3)
                .ingredients("bacon")
                .ingredients("lettuce")
                .ingredients("shrimp")
                .build();
        System.out.println(bigmac);
        //When
        int quantityOfIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(3, quantityOfIngredients);


    }
}
