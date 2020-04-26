package com.course.good.patterns.challenges.foodservice;

public class OrderRequest {

    private ShopId shopId;
    private String productName;
    private int productQuantity;

    public OrderRequest(ShopId shopId, String productName, int productQuantity) {
        this.shopId = shopId;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public ShopId getShopId() {
        return shopId;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
