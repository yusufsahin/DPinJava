package com.example.abst;

import com.example.conc.Transaction;

public interface FraudDetector {
    void setNextDetector(FraudDetector nextDetector);
    boolean detectFraud(Transaction transaction);

}
