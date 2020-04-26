package com.course.good.patterns.challenges.foodservice;

public class GlutenFreeShop implements Shop {
    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Order in Gluten Free Shop is processing, thanks for bought:\n" + quantity + " pcs of " + product);
        return true;
    }
}
