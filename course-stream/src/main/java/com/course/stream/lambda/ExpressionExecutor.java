package com.course.stream.lambda;

public class ExpressionExecutor {

    public void executeExpression(double a, double b, MathExpression mathExpression){

        double result = mathExpression.executeExpression(a, b);
        System.out.println("Result equals: "+result);
    }

}
