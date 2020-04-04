package com.course.testing.shape;

public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "Shape - circle ";
    }

    @Override
    public String getField() {
        return "Area = 3,14*r^2 ";
    }
}
