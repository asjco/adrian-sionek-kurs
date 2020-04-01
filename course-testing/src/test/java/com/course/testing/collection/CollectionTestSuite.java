package com.course.testing.collection;

import org.junit.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        System.out.println("Testing Empty ArrayList \"numbers\", elements of list: " + numbers);
        List<Integer> result = ext.exterminate(numbers);
        System.out.println("Testing Empty ArrayList \"evenNumbers\", elements of list: " + result);
        //Then
        Assert.assertEquals(numbers, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        System.out.println("Testing Normal ArrayList \"numbers\", elements of list: " + numbers);
        List<Integer> result = ext.exterminate(numbers);
        System.out.println("Testing Normal ArrayList \"evenNumbers\", elements of list: " + result);
        //Then
        List<Integer> expected = Arrays.asList(4, 6);
        Assert.assertEquals(expected, result);
    }

}
