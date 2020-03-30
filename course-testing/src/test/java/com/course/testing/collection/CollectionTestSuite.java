package com.course.testing.collection;

import org.junit.*;

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
        int result = numbers.size();
        System.out.println("Testing Empty ArrayList \"numbers\", size of list: "+result );
        int result2 = ext.exterminate(numbers);
        System.out.println("Testing Empty ArrayList \"evenNumbers\", size of list: "+result2 );
        //Then
        Assert.assertEquals(0, result);
        Assert.assertEquals(0, result2);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(1);
            numbers.add(1);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

        OddNumbersExterminator ext = new OddNumbersExterminator();
        //When
        int result = numbers.size();
        System.out.println("Testing Normal ArrayList \"numbers\", size of list: "+result );
        int result2 = ext.exterminate(numbers);
        System.out.println("Testing Normal ArrayList \"evenNumbers\", size of list: "+result2 );
        //Then
        Assert.assertEquals(5, result);
        Assert.assertEquals(1, result2);
    }

}
