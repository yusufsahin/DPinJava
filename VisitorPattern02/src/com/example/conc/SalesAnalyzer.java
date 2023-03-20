package com.example.conc;

import com.example.abst.Visitor;

import java.util.HashMap;
import java.util.Map;

public class SalesAnalyzer implements Visitor {
    private Map<String, Integer> productSales = new HashMap<>();
    private Map<String, Double> customerSales = new HashMap<>();

    @Override
    public void visit(Product product) {
        productSales.put(product.getName(),product.getQuantity());
    }

    @Override
    public void visit(Customer customer) {
        customerSales.put(customer.getName(),0.0);
    }

    @Override
    public void visit(Sale sale) {
        // Update the customer sales data in the customerSales map
        double totalSale = 0.0;
        for (Product product : sale.getProducts()) {
            totalSale += product.getPrice();
            productSales.put(product.getName(), productSales.get(product.getName()) + 1);
        }
        customerSales.put(sale.getCustomer().getName(), customerSales.get(sale.getCustomer().getName()) + totalSale);
    }

    // Getters for productSales and customerSales
    public Map<String, Integer> getProductSales() {
        return productSales;
    }

    public Map<String, Double> getCustomerSales() {
        return customerSales;
    }

}
