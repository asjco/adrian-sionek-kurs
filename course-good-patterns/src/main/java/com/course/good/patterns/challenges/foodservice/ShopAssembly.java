package com.course.good.patterns.challenges.foodservice;

public class ShopAssembly {

    public Shop shopAssembler(OrderRequest orderRequest) {

        if ("sausage".equals(orderRequest.getProductName())) {
            return new ExtraFoodShop();
        } else if ("soy milk".equals(orderRequest.getProductName())) {
            return new GlutenFreeShop();
        } else {
            return new HealthyShop();
        }
    }
}
