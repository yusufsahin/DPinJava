package com.example.conc;

import com.example.abst.PaymentProcessor;
import com.example.abst.PaymentProcessorFactory;

public class BankTransferPaymentProcessorFactory implements PaymentProcessorFactory {
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new BankTransferPaymentProcessor();
    }
}
