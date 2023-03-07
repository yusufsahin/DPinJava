package com.example.conc;

import sun.lwawt.macosx.CSystemTray;

public class CreditCardGateway {

    public void processPayment(String customerId,double amount){
        System.out.println("Processing payment for customer " + customerId + " amount " + amount + " using credit card payment system");
    }
}
