package com.example.conc;

import com.example.abst.PaymentProcessor;

public class BankTransferPaymentProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment "+amount);
    }
}
