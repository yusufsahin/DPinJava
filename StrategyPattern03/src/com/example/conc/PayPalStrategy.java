package com.example.conc;

import com.example.abst.PaymentStrategy;
import sun.lwawt.macosx.CSystemTray;

public class PayPalStrategy implements PaymentStrategy {

    private String email;
    private String password;

    public PayPalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean pay(double amount) {
        System.out.println(amount+" paid using PayPal");
        return true;
    }
}
