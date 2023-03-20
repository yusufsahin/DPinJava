package com.example.conc;

import com.example.abst.Element;
import com.example.abst.Visitor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
