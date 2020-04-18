package com.course.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }

        try {
            return a / b;

        } catch (ArithmeticException e) {
            System.out.println("Oh no, something went wrong " + e);
            return 0;

        } finally {
            System.out.println("Denominator used in divide: " + b);

        }


    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
