package com.course.good.patterns.challenges.foodservice;

public class OrderRequest {

    private String productName;
    private int productQuantity;

    public OrderRequest(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }


    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
