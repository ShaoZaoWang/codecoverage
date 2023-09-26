package com.example.demo.designpatterns.statepattern.impl;

import com.example.demo.designpatterns.statepattern.Order;
import com.example.demo.designpatterns.statepattern.OrderState;

public class PaidState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("订单已经支付，不能支付");
    }

    @Override
    public void ship(Order order) {
        System.out.println("订单已经发货");
        order.setState(new ShippedState());
    }

    @Override
    public void receive(Order order) {
        System.out.println("订单还没有发货，不能收货");
    }
}
