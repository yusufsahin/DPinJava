package com.example.abst;

import java.util.List;

public interface Employee {

    public String getName();
    public double getSalary();

    public void add(Employee employee);
    public void  remove(Employee employee);

    public List<Employee> getSubOrdinates();
}
