package com.example.demo.designpatterns.statepattern;

public interface OrderState {
    void pay(Order order);
    void ship(Order order);
    void receive(Order order);

}
