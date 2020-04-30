package com.course.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.course.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double adding = calculator.add(2, 4);
        double subtract = calculator.sub(10,1);
        double multiplication = calculator.mul(3, 2);
        double divide = calculator.div(81, 9);
        //Then
        Assert.assertEquals(6, adding, 0.0001);
        Assert.assertEquals(9, subtract, 0.0001);
        Assert.assertEquals(6, multiplication, 0.0001);
        Assert.assertEquals(9, divide, 0.0001);

    }
}
