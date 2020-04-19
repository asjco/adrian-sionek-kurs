package com.course.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(3, 5.2);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("I'm here again :D");
        }


    }
}
