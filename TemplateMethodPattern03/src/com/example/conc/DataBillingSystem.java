package com.example.conc;

import com.example.abst.AbstaractBillingSystem;

import java.math.BigDecimal;

public class DataBillingSystem extends AbstaractBillingSystem {
    protected BigDecimal calculateUsageCost(ServiceUsage usage) {
        // Calculate the usage cost for data service
        int dataUsage=0;

        if (usage.getServiceName()=="data") {
            dataUsage = usage.getUsage();
        }
        // Assume data usage cost is $0.01 per unit
        BigDecimal dataCost = BigDecimal.valueOf(dataUsage * 0.01);
        return dataCost;
    }

}
