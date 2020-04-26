package com.course.good.patterns.challenges.foodservice;

public class Food2DoorService {
    public static void main(String[] args) {
        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ExtraFoodShop(), new ShopOrderRepository());
        orderProcessor.orderProcess(orderRequest);
    }
}
