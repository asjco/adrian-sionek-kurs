package com.course.good.patterns.challenges.flightservice;

import java.util.LinkedList;
import java.util.List;

public class Flight1 implements Flight {
    @Override
    public List<String> airportsList() {
        List<String> list = new LinkedList<>();
        list.add("Warsaw");
        list.add("Lublin");
        return list;
    }
}
