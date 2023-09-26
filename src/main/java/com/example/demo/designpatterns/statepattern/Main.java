package com.example.demo.designpatterns.statepattern;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getState());

        order.pay();
        order.ship();
        order.receive();
        order.ship();

        System.out.println(order.getState());
    }
}
