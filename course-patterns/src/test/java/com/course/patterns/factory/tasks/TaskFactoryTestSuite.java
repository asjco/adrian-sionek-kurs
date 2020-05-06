package com.course.patterns.factory.tasks;

import com.course.patterns.factory.Shape;
import com.course.patterns.factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING);
        boolean isDone = shopping.isTaskExecuted();
        //Then
        System.out.println(shopping.executeTask());
        Assert.assertEquals("Shopping", shopping.getTaskName());
        Assert.assertTrue(isDone);
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING);
        boolean isDone = painting.isTaskExecuted();
        //Then
        System.out.println(painting.executeTask());
        Assert.assertEquals("Painting", painting.getTaskName());
        Assert.assertTrue(isDone);
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING);
        boolean isDone = driving.isTaskExecuted();
        //Then
        System.out.println(driving.executeTask());
        Assert.assertEquals("Driving", driving.getTaskName());
        Assert.assertTrue(isDone);
    }
}
