package com.example.abst;

import com.example.conc.Item;
import com.example.conc.Order;

public interface OrderState {
    void addItem(Item item);
    void removeItem(Item item);
    void updateStatus(Order order);
    void issueRefund(Order order);

}
