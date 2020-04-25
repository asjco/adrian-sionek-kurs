package com.course.good.patterns.challenges.orderservice;

public class PremiumOrderService implements OrderService {

    @Override
    public boolean order(User user, String product, int quantity) {
        return true;
    }
}
