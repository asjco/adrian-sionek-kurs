package com.course.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;

        try {
            result = firstChallenge.divide(3, 0);
            System.out.println("Result " + result);

        } catch (ArithmeticException e) {
            System.out.println("Oh no, something went wrong " + e);

        } finally {
            System.out.println("Verification result of divide = " + result);

        }

    }
}
