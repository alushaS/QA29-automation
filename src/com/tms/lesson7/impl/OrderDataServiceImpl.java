package com.tms.lesson7.impl;

import com.tms.lesson7.service.OrderDataService;
import com.tms.lesson7.domain.Order;

public class OrderDataServiceImpl implements OrderDataService {

    @Override
    public void saveOrderData(Order order) {
        System.out.println("Заказ сохранен в БД");
    }
}
