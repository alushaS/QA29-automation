package com.tms.lesson7.domain;

import com.tms.lesson7.impl.*;
import com.tms.lesson7.service.ClientServiceHandler;

public class MainApp {

    public static void main(String[] args) {

        Order order = new Order();

        ClientServiceHandler handler = new ClientServiceHandlerImpl(
                new PhoneOrderImpl(),
                new OrderDataServiceImpl(),
                new CookingProcessImpl(),
                new TakeAwayDeliveryImpl());

        handler.makeOrder(order);
    }

}

