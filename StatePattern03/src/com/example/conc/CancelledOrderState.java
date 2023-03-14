package com.example.conc;

import com.example.abst.OrderState;

public class CancelledOrderState implements OrderState {

    public CancelledOrderState() {
        System.out.println("Order - Cancalled");
    }

    @Override
    public void addItem(Item item) {

    }

    @Override
    public void removeItem(Item item) {

    }

    @Override
    public void updateStatus(Order order) {

    }

    @Override
    public void issueRefund(Order order) {

    }
}
