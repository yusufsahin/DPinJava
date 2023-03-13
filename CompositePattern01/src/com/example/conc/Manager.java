package com.example.conc;

import com.example.abst.Employee;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {

    private  String name;
    private double salary;
    private  List<Employee> subordinates;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    @Override
    public List<Employee> getSubOrdinates() {
        return subordinates;
    }
}
