package com.course.good.patterns.challenges.foodservice;


public class OrderProcessor {

    private final Shop shop;
    private final OrderRepository orderRepository;

    public OrderProcessor(final Shop shop, final OrderRepository orderRepository) {
        this.shop = shop;
        this.orderRepository = orderRepository;
    }

    public ShopOrderDto orderProcess(final OrderRequest orderRequest) {
        boolean isOrdered = shop.process(orderRequest.getProductName(), orderRequest.getProductQuantity());

        if (isOrdered) {
            orderRepository.createOrder(shop.getShop(), orderRequest.getProductName(), orderRequest.getProductQuantity());

            return new ShopOrderDto(shop.getShop(), true);
        } else {
            return new ShopOrderDto(shop.getShop(), false);
        }
    }
}
