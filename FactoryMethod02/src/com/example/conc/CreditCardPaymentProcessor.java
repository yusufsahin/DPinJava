package com.example.conc;

import com.example.abst.PaymentProcessor;

public class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment for "+amount);
    }
}
