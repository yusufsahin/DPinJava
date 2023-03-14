package com.example.conc;

import com.example.abst.OrderState;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private OrderState state;
    private List<Item> items;
    public Order() {
        state = new NewOrderState();
        items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        state.addItem(item);
        items.add(item);
    }

    public void removeItem(Item item) {
        state.removeItem(item);
        items.remove(item);
    }

    public void updateStatus() {
        state.updateStatus(this);
    }

    public void issueRefund() {
        state.issueRefund(this);
    }

    public void setState(OrderState state) {
        this.state = state;
    }

}
