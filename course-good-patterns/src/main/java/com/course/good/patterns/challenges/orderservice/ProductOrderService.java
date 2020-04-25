package com.course.good.patterns.challenges.orderservice;

public class ProductOrderService {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor processor = new OrderProcessor(new EmailInformationService(), new PremiumOrderService(), new PremiumOrderRepository());
        processor.process(orderRequest);
    }
}
