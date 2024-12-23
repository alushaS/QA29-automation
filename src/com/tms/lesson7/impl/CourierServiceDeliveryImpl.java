package com.tms.lesson7.impl;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.DeliveryService;

public class CourierServiceDeliveryImpl implements DeliveryService {

    @Override
    public void deliverOrder(Order order) {
        System.out.println("Доставка заказа до дома клиента");
    }
}
