package com.example.conc;

import com.example.abst.Visitor;

public class PremiumCalculator implements Visitor {
    private double basePremium = 100.0;
    private int ageFactor = 1;
    private double occupationFactor = 1.0;
    private double belongingsFactor = 0.01;

    @Override
    public void visit(Age age) {
        if (age.getAge() < 25) {
            ageFactor = 2;
        } else if (age.getAge() > 50) {
            ageFactor = 3;
        }


    }

    @Override
    public void visit(Occupation occupation) {
        switch (occupation.getOccupation()) {
            case "Student":
                occupationFactor = 0.5;
                break;
            case "Engineer":
                occupationFactor = 1.5;
                break;
            case "Doctor":
                occupationFactor = 2.0;
                break;
            default:
                occupationFactor = 1.0;
        }

    }

    @Override
    public void visit(Belongings belongings) {
        belongingsFactor = belongings.getValue() * 0.01;
    }

    public double getPremium() {
        // Calculate the premium based on the adjusted factors
        return basePremium * ageFactor * occupationFactor * belongingsFactor;
    }

}
