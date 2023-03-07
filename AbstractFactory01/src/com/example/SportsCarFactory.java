package com.example;

public class SportsCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return  new SportsCar();
    }
}
