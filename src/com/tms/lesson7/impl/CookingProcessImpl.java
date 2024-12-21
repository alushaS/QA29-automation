package com.tms.lesson7.impl;

import com.tms.lesson7.service.CookingProcess;
import com.tms.lesson7.domain.Order;

public class CookingProcessImpl implements CookingProcess {

    @Override
    public void showCookingStatus(Order order) {
        System.out.println("Заказ готовится");
    }
}
