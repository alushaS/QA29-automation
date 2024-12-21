package com.tms.lesson7.impl;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.*;

public class ClientServiceHandlerImpl  implements ClientServiceHandler {

    private OrderReceiving orderReceiving;
    private OrderDataService orderDataService;
    private CookingProcess cookingProcess;
    private DeliveryService orderDelivery;

    public ClientServiceHandlerImpl(OrderReceiving orderReceiving, OrderDataService orderDataService, CookingProcess cookingProcess, DeliveryService orderDelivery) {
        this.orderReceiving = orderReceiving;
        this.orderDataService = orderDataService;
        this.cookingProcess = cookingProcess;
        this.orderDelivery = orderDelivery;
    }

    @Override
    public void makeOrder(Order order) {
        System.out.println("step_1: receive order");
        orderReceiving.receiveOrder(order);

        System.out.println("step_2: order is saved");
        orderDataService.saveOrderData(order);

        System.out.println("step_3: order is being cooked");
        cookingProcess.showCookingStatus(order);

        System.out.println("step_4: order delivery");
        orderDelivery.deliverOrder(order);

    }
}

