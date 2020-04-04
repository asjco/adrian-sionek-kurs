package com.course.testing.shape;

public class Triangle implements Shape {

    @Override
    public String getShapeName() {
        return "Shape - triangle ";
    }

    @Override
    public String getField() {
        return "Area = (a*h)/2 ";
    }
}
