package com.example.conc;


import com.example.abst.Customer;

public class OneOnOneCustomer extends Customer {

    public void displayInfo() {
        System.out.println("One-On-One Customer Information:");
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
    }
}
