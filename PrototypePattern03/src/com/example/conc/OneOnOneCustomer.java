package com.example.conc;

import com.example.abst.Prototype;

public class OneOnOneCustomer implements Prototype {
    private int Id;
    private  String customerNumber;
    private String firstName;
    private String lastName;

    public OneOnOneCustomer(int id, String customerNumber, String firstName, String lastName) {
        Id = id;
        this.customerNumber = customerNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Prototype clone() {
        return null;
    }
}
