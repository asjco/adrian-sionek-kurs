package com.course.good.patterns.challenges.foodservice;

public class ShopOrderRepository implements OrderRepository {


    @Override
    public boolean createOrder(ShopId shopId, String product, int quantity) {
        return true;
    }
}
