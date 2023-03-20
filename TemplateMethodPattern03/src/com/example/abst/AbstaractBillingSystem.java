package com.example.abst;

import com.example.conc.Customer;
import com.example.conc.ServiceUsage;

import java.math.BigDecimal;

public abstract class AbstaractBillingSystem {
    protected abstract BigDecimal calculateUsageCost(ServiceUsage usage);
    public final BigDecimal generateBill(Customer customer) {
        BigDecimal totalCost = BigDecimal.ZERO;
        for (ServiceUsage usage : customer.getServiceUsages()) {
            BigDecimal usageCost = calculateUsageCost(usage);
            totalCost = totalCost.add(usageCost);
        }
        return totalCost;
    }


}
