package com.example.abst;

import com.example.conc.ElementA;
import com.example.conc.ElementB;

public interface Visitor {
    void visit(ElementA element);
    void visit(ElementB element);
}
