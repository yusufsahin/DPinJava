package com.example;

public class FamilyCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new FamilyCar();
    }
}
