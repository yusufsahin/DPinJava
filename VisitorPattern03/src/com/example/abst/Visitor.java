package com.example.abst;

import com.example.conc.Age;
import com.example.conc.Belongings;
import com.example.conc.Occupation;

public interface Visitor {
    void visit(Age age);

    void  visit(Occupation occupation);

    void  visit(Belongings belongings);
}
