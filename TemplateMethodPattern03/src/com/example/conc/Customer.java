package com.example.conc;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<ServiceUsage> serviceUsages = new ArrayList<>();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addService(ServiceUsage serviceUsage) {
        serviceUsages.add(serviceUsage);
    }

    public List<ServiceUsage> getServiceUsages() {
        return serviceUsages;
    }
}
