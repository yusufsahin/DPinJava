package com.example.conc;

import com.example.abst.Aggregate;
import com.example.abst.Iterator;

import java.util.ArrayList;

public class ConreteAggregate extends Aggregate {

    private  ArrayList items=new ArrayList();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public  int count(){
        return items.size();
    }
    public  Object get(int index)
    {
        return  items.get(index);
    }

    public  void  set(int index,Object value)
    {
        items.add(index,value);
    }
}
