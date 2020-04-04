package com.course.testing.shape;

public class Square implements Shape {

    @Override
    public String getShapeName() {
        return "Shape - square ";
    }

    @Override
    public String getField() {
        return "Area = a^2 ";
    }
}
