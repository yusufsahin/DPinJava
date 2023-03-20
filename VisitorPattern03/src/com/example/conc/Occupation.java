package com.example.conc;

import com.example.abst.DataPoint;
import com.example.abst.Visitor;

public class Occupation implements DataPoint {

    private String occupation;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
