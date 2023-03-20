package com.example.abst;

import com.example.conc.Customer;
import com.example.conc.Product;
import com.example.conc.Sale;

public interface Visitor {
    void visit(Product product);
    void  visit(Customer customer);

    void  visit(Sale sale);
}
