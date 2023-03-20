package com.example.conc;

import com.example.abst.AbstaractBillingSystem;
import sun.lwawt.macosx.CSystemTray;

import java.math.BigDecimal;

public class MessageBillingSystem extends AbstaractBillingSystem {
    protected BigDecimal calculateUsageCost(ServiceUsage usage) {
        // Calculate the usage cost for messaging service
        int messageUsage = 0;

        if(usage.getServiceName()=="messaging") {

            messageUsage=usage.getUsage();
        }
        // Assume message usage cost is $0.05 per message
        BigDecimal messageCost = BigDecimal.valueOf(messageUsage * 0.05);
        return messageCost;
    }

}
