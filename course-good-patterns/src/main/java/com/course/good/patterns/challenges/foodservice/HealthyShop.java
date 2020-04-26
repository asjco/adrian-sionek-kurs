package com.course.good.patterns.challenges.foodservice;

public class HealthyShop implements Shop {
    @Override
    public ShopId getShop() {
        ShopId shopId = new ShopId("Healthy Shop", "5621231237");
        return shopId;
    }

    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Order in Healthy Shop is processing, thanks for bought:\n" + quantity + " pcs of " + product);
        return true;
    }
}
