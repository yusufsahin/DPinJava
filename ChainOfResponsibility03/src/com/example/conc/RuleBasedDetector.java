package com.example.conc;

import com.example.abst.FraudDetector;

public class RuleBasedDetector implements FraudDetector {
    private FraudDetector nextDetector;


    @Override
    public void setNextDetector(FraudDetector nextDetector) {
        this.nextDetector=nextDetector;
    }

    @Override
    public boolean detectFraud(Transaction transaction) {
        // Perform rule-based analysis
        if (transaction.getAmount() > 50000) {
            System.out.println("Rule-based analysis detected fraud for transaction " + transaction.getTransactionId());
            return true;
        }

        // Pass on to next detector
        if (nextDetector != null) {
            return nextDetector.detectFraud(transaction);
        }

        return false;
    }

}

