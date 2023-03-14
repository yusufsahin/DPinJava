package com.example.conc;

import com.example.abst.AccountObserver;

public class EmailNotification implements AccountObserver {

    private  String emailAddress;

    public EmailNotification(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(double balance) {
        System.out.println("Sending email notification to " + emailAddress + ": Account balance is now " + balance);

    }
}
