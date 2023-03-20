package com.example.conc;

import com.example.abst.Visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA element) {
        System.out.println("Visiting ElementA");

    }

    @Override
    public void visit(ElementB element) {
        System.out.println("Visiting ElementB");
    }
}
