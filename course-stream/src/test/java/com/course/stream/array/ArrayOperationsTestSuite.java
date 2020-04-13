package com.course.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int[] numbers = new int[20];
        numbers[0] = 4;
        numbers[1] = 35;
        numbers[2] = 24;
        numbers[3] = 14;
        numbers[4] = 84;
        numbers[5] = 44;
        numbers[6] = 22;
        numbers[7] = 3;
        numbers[8] = 32;
        numbers[9] = 57;
        numbers[10] = 69;
        numbers[11] = 89;
        numbers[12] = 40;
        numbers[13] = 55;
        numbers[14] = 4;
        numbers[15] = 43;
        numbers[16] = 34;
        numbers[17] = 74;
        numbers[18] = 98;
        numbers[19] = 67;

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(44.6, result, 0.0001);

    }
}
