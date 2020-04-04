package com.course.testing.shape;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(1, shapeCollector.listQuantity());
    }

    @Test
    public void testRemoveFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.listQuantity());
    }

    @Test
    public void testRemoveFigureNotExisting() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testGetFigure() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);

        //When
        Shape figure = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle, figure);
    }

    @Test
    public void testGetFigureNegativeIndex() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);

        //When
        Shape figure = shapeCollector.getFigure(-1);

        //Then
        Assert.assertNull(figure);
    }

    @Test
    public void testGetFigureOverIndex() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);

        //When
        Shape figure = shapeCollector.getFigure(2);

        //Then
        Assert.assertNull(figure);
    }

    @Test
    public void testShowFigures() {

        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);

        //When
        List<Shape> show = shapeCollector.showFigures();

        //Then
        List<Shape> test = new ArrayList<>();
        test.add(circle);

        Assert.assertEquals(test, show);
    }

}
