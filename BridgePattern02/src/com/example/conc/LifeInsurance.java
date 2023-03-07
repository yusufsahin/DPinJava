package com.example.conc;

import com.example.abst.InsurancePolicy;

public class LifeInsurance extends InsurancePolicy {
    private double premium;
    public LifeInsurance(double premium) {
        this.premium = premium;
    }

    @Override
    public double calculatePremium() {
        return premium;
    }
    @Override
    public void payPremium() {
        System.out.println("Your life insurance premium of $" + premium + " has been paid.");
    }
}
