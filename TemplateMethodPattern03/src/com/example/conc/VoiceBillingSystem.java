package com.example.conc;

import com.example.abst.AbstaractBillingSystem;

import java.math.BigDecimal;

public class VoiceBillingSystem extends AbstaractBillingSystem {
    protected BigDecimal calculateUsageCost(ServiceUsage usage) {
        // Calculate the usage cost for voice service

        int voiceUsage=0;
        if (usage.getServiceName()=="voice")
        {
         voiceUsage = usage.getUsage();
        }
        // Assume voice usage cost is $0.10 per minute
        BigDecimal voiceCost = BigDecimal.valueOf(voiceUsage * 0.10);
        return voiceCost;
    }

}
