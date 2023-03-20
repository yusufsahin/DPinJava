package com.example.conc;

import com.example.abst.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<Product> products;
    private PaymentStrategy paymentStrategy;

    public Order() {

        products= new ArrayList<>();
    }

    public  void addProduct(Product product)
    {
        products.add(product);
    }

    public void  removeProduct(Product product)
    {
        products.remove(product);
    }

    public double calculateTotal()
    {
        double total=0;

        for (Product product:products) {
            total+= product.getPrice();
        }
        return total;
    }

    public boolean processPayment()
    {
        double amount=calculateTotal();
        return  paymentStrategy.pay(amount);
    }

    public  void  setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }

}
