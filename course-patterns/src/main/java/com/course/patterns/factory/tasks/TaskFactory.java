package com.course.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskName) {
        switch (taskName) {
            case SHOPPING:
                return new ShoppingTask(null, "computer graphic card", 2.0);
            case PAINTING:
                return new PaintingTask("Painting", "black", "it");
            case DRIVING:
                return new DrivingTask("Driving", "to hell", "Dacia");
            default:
                return null;
        }
    }
}
