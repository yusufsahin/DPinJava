package com.example.conc;

import com.example.abst.FraudDetector;

public class TransactionMonitoringDetector implements FraudDetector {

    private  FraudDetector nextDetector;
    @Override
    public void setNextDetector(FraudDetector nextDetector) {
        this.nextDetector=nextDetector;
    }

    @Override
    public boolean detectFraud(Transaction transaction) {
        // Perform transaction monitoring checks
        if (transaction.getAmount() > 10000) {
            System.out.println("Transaction monitoring detected fraud for transaction " + transaction.getTransactionId());
            return true;
        }

        // Pass on to next detector
        if (nextDetector != null) {
            return nextDetector.detectFraud(transaction);
        }

        return false;
    }


}
