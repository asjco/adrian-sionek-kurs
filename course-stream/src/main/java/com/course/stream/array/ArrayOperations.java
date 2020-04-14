package com.course.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers){



            System.out.println("Array Elements:");

            IntStream.range(0, numbers.length)
                    .forEach(value -> System.out.println(numbers[value]));

            OptionalDouble avg = IntStream.range(0, numbers.length)
                    .map(n -> numbers[n])
                    .average();

            double value = avg.orElse(0);

            System.out.println("average equals: " + value);

            return value;

    }
}
