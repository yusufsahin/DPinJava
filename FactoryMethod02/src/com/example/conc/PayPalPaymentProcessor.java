package com.example.conc;

import com.example.abst.PaymentProcessor;

public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paypal payment for "+amount);
    }
}
