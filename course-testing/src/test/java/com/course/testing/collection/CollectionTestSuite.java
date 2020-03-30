package com.course.testing.collection;

import org.junit.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        System.out.println("Testing Empty ArrayList \"numbers\", elements of list: "+numbers );
        ArrayList<Integer> result = ext.exterminate(numbers);
        System.out.println("Testing Empty ArrayList \"evenNumbers\", elements of list: "+result );
        //Then
        Assert.assertEquals(numbers, result);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(1);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);

        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        System.out.println("Testing Normal ArrayList \"numbers\", elements of list: "+numbers );
        ArrayList<Integer> result = ext.exterminate(numbers);
        System.out.println("Testing Normal ArrayList \"evenNumbers\", elements of list: "+result );
        //Then
            ArrayList<Integer> testList = new ArrayList<Integer>();
                testList.add(4);
                testList.add(6);
        Assert.assertEquals(testList, result);
    }

}
