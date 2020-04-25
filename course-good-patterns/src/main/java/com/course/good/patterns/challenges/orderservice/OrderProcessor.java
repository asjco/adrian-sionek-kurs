package com.course.good.patterns.challenges.orderservice;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProductName(), orderRequest.getProductQuantity());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());

            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProductName(), orderRequest.getProductQuantity());
            return new OrderDto(orderRequest.getUser(), true);

        } else {
            System.out.println("Not Ordered");
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
