package com.course.good.patterns.challenges.foodservice;

public class OrderRequestRetrieve {

    public OrderRequest retrieve() {
        String product = "soy milk";
        int quantity = 12;

        return new OrderRequest(product, quantity);
    }
}
