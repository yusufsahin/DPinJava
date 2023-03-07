package com.example.conc;

import com.example.abst.DigitalWalletGateway;

public class CreditCardToDigitalWalletGatewayAdapter implements DigitalWalletGateway {

    private CreditCardGateway creditCardGateway;

    public CreditCardToDigitalWalletGatewayAdapter(CreditCardGateway creditCardGateway)
    {
        this.creditCardGateway=creditCardGateway;
    }
    @Override
    public void pay(String customerId, double amount) {
        creditCardGateway.processPayment(customerId,amount);
    }
}
