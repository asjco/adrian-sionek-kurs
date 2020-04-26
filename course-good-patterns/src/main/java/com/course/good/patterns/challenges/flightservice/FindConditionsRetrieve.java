package com.course.good.patterns.challenges.flightservice;

public class FindConditionsRetrieve {

    public FindConditions getConditions(){
        String airport = "Warsaw";
        FindFrom findFrom = new FindFrom();

        return new FindConditions(airport, findFrom);
    }
}
