package com.course.good.patterns.challenges.orderservice;

public class OrderRequest {

    private User user;
    private String productName;
    private int productQuantity;

    public OrderRequest(User user, String productName, int productQuantity) {
        this.user = user;
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public User getUser() {
        return user;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
