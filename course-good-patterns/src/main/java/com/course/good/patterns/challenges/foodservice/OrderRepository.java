package com.course.good.patterns.challenges.foodservice;

public interface OrderRepository {

    boolean createOrder(ShopId shopId, String product, int quantity);
}
