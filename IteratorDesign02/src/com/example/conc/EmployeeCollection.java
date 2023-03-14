package com.example.conc;

import com.example.abst.Aggregate;
import com.example.abst.Iterator;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class EmployeeCollection implements Aggregate<Employee> {

    private ArrayList<Employee> employees;

    public EmployeeCollection() {
        employees=new ArrayList<>();
    }

    public void addEmployee(Employee employee)
    {
        employees.add(employee);
    }

    public  void  removeEmployee(Employee employee)
    {
        employees.remove(employee);
    }


    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator();
    }

    private class EmployeeIterator implements Iterator<Employee>{

        private  int position;
        @Override
        public boolean hasNext() {
            return position<employees.size();
        }

        @Override
        public Employee next() {
            if(!hasNext()){
                throw  new NoSuchElementException();
            }
            return employees.get(position++);
        }
    }
}
