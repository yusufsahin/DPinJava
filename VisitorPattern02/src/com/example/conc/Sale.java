package com.example.conc;

import com.example.abst.DataPoint;
import com.example.abst.Visitor;

import java.util.Date;
import java.util.List;

public class Sale implements DataPoint {
    private String id;
    private Date date;
    private Customer customer;
    private List<Product> products;

    public Sale(String id, Date date, Customer customer, List<Product> products) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.products = products;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
