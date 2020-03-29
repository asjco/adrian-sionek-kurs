package com.course.testing;

import com.course.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result1 = calculator.add(2,3);

        if (result1 == 5) {
            System.out.println("test1 OK");
        } else {
            System.out.println("error");
        }

        int result2 = calculator.subtract(10, 4);

        if(result2 == 6){
            System.out.println("test2 OK");
        }
        else {
            System.out.println("error");
        }

    }
}
