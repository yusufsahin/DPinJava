package com.example.conc;

import com.example.abst.Iterator;

public class ConcreteIterator extends Iterator {
    private ConreteAggregate aggregate;
    private  int curent=0;


    public ConcreteIterator(ConreteAggregate aggregate) {
       this.aggregate=aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        if(curent< aggregate.count()-1)
        {
            ret=aggregate.get(++curent);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return  curent>= aggregate.count();
    }

    @Override
    public Object currentItem() {
        return aggregate.get(curent);
    }
}
