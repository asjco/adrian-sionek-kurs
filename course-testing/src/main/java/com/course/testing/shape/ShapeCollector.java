package com.course.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapesList = new ArrayList<>();

    public void addFigure(Shape shape) {

        shapesList.add(shape);

    }

    public boolean removeFigure(Shape shape) {

        boolean result = false;
        if (shapesList.contains(shape)) {
            shapesList.remove(shape);
            result = true;
        }
        return result;

    }

    public Shape getFigure(int n) {

        Shape shape = null;
        if (n >= 0 && n < shapesList.size()) {
            shape = shapesList.get(n);
        }
        return shape;
    }

    public String showFigures() {
        String result = null;
        for(Shape obj : shapesList){
           String var1 = obj.getShapeName();
           String var2 = obj.getField();

            result = var1 + var2;
        }

        return result;
    }

    public int listQuantity() {
        return shapesList.size();
    }

}
