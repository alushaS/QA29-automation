package com.tms.lesson7.impl;

import com.tms.lesson7.domain.Order;
import com.tms.lesson7.service.OrderReceiving;

public class OnlineOrderImpl implements OrderReceiving {

    @Override
    public void receiveOrder(Order order) {
        System.out.println("Заказ получен онлайн");
    }
}