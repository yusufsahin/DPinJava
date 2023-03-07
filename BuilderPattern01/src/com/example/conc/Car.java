package com.example.conc;

public class Car {
    private String make;
    private String model;

    private String color;
    private  int year;
    private int numberOfDoors;

    private  Car(Builder builder)
    {
        this.make=builder.make;
        this.model= builder.model;;
        this.color= builder.color;
        this.year= builder.year;
        this.numberOfDoors = builder.numberofDoors;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

        public static class Builder{
            private String make;
            private String model;
            private String color;
            private int year;
            private int numberofDoors;

            public  Builder(){

            }

            public  Builder setMake(String make)
            {
                this.make=make;
                return this;
            }

            public Builder setModel(String model)
            {
                this.model=model;
                return this;
            }

            public Builder setYear(int year)
            {
                this.year=year;
                return this;
            }

            public Builder setColor(String color)
            {
                this.color=color;
                return this;
            }

            public Builder setNumberOfDoors(int numberOfDoors)
            {
                this.numberofDoors=numberOfDoors;
                return this;
            }

            public  Car build(){
                return  new Car(this);
            }

        }
}
