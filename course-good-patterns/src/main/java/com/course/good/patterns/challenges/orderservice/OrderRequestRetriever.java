package com.course.good.patterns.challenges.orderservice;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("Andrew", "Smith");
        String product = "paper";
        int quantity = 16;

        return new OrderRequest(user, product, quantity);
    }
}
