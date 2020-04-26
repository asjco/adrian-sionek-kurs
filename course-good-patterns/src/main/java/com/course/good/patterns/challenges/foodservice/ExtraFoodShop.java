package com.course.good.patterns.challenges.foodservice;

public class ExtraFoodShop implements Shop {

    @Override
    public ShopId getShop() {
        ShopId shopId = new ShopId("Extra Food Shop", "7821230987");
        return shopId;
    }


    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Order in Extra Food Shop is processing, thanks for bought:\n" + quantity + " pcs of " + product);
        return true;
    }
}
