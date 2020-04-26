package com.course.good.patterns.challenges.foodservice;

public class Food2DoorService {
    public static void main(String[] args) {
        OrderRequestRetrieve orderRequestRetrieve = new OrderRequestRetrieve();
        OrderRequest orderRequest = orderRequestRetrieve.retrieve();

        ShopAssembly shopAssembly = new ShopAssembly();
        OrderProcessor orderProcessor = new OrderProcessor(shopAssembly.shopAssembler(orderRequest), new ShopOrderRepository());
        orderProcessor.orderProcess(orderRequest);
    }
}
