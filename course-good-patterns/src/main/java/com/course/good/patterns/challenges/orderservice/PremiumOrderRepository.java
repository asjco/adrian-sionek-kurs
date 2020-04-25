package com.course.good.patterns.challenges.orderservice;

public class PremiumOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, String product, int quantity) {
        return true;
    }
}
