package com.example.conc;

import com.example.abst.PaymentStrategy;
import sun.lwawt.macosx.CSystemTray;

public class CashOnDeliveryStrategy implements PaymentStrategy {

    private String address;

    public CashOnDeliveryStrategy(String address) {
        this.address = address;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println(amount + " paid using cash on delivery at address "+ address);
        return true;
    }
}
