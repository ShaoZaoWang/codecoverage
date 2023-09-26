package com.example.demo.designpatterns.statepattern.impl;

import com.example.demo.designpatterns.statepattern.Order;
import com.example.demo.designpatterns.statepattern.OrderState;

public class ReceivedState implements OrderState {
    @Override
    public void pay(Order order) {
        System.out.println("订单已经收获，不能支付");
    }

    @Override
    public void ship(Order order) {
        System.out.println("订单已经收货，不能再次发货");
    }

    @Override
    public void receive(Order order) {
        System.out.println("订单已经收货，不能再次收货");
    }
}
