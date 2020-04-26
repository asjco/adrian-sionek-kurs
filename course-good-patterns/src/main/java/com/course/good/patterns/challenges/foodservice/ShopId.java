package com.course.good.patterns.challenges.foodservice;

public class ShopId {

    private String shopName;
    private String nipId;

    public ShopId(String shopName, String nipId) {
        this.shopName = shopName;
        this.nipId = nipId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getNipId() {
        return nipId;
    }
}
