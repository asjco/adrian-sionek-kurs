package com.course.good.patterns.challenges.foodservice;

public interface Shop {

    ShopId getShop();

    boolean process(String product, int quantity);
}
