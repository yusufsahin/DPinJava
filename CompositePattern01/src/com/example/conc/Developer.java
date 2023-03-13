package com.example.conc;

import com.example.abst.Employee;

import java.util.List;

public class Developer implements Employee {
    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
        //Uygulabilir değil
    }

    @Override
    public void remove(Employee employee) {
        //uygulanabilir değil
    }

    @Override
    public List<Employee> getSubOrdinates() {
        return null;
    }
}
