package com.course.good.patterns.challenges.orderservice;

public class OrderDto {

    private User user;
    private boolean isOrdered;

    public OrderDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }
}
