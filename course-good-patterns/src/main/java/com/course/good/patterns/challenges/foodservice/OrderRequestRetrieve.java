package com.course.good.patterns.challenges.foodservice;

public class OrderRequestRetrieve {

    public OrderRequest retrieve() {
        ShopId shopId = new ShopId("Extra Food Shop", "7821230987");
        String product = "sausage";
        int quantity = 12;

        return new OrderRequest(shopId, product, quantity);
    }
}
