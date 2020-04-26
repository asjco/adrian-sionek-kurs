package com.course.good.patterns.challenges.foodservice;

public class ShopOrderDto {

    private ShopId shopId;
    private boolean isOrdered;

    public ShopOrderDto(ShopId shopId, boolean isOrdered) {
        this.shopId = shopId;
        this.isOrdered = isOrdered;
    }

    public ShopId getShopId() {
        return shopId;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
