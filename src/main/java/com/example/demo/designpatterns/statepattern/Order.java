package com.example.demo.designpatterns.statepattern;

import com.example.demo.designpatterns.statepattern.impl.PaidState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private OrderState state;

    public Order() {
        state = new PaidState();
    }

    public void pay() {
        state.pay(this);
    }

    public void ship() {
        state.ship(this);
    }

    public void receive() {
        state.receive(this);
    }

}
