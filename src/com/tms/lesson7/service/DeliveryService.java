package com.tms.lesson7.service;

import com.tms.lesson7.domain.Order;

public interface DeliveryService {

   default void deliverOrder(Order order){

           System.out.println("Реализация заказа через пункт выдачи");
       }
   }


