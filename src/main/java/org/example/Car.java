package org.example;

public class Car extends Vehicle {
    private String fuel;


    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public Car()
    {}

    public Car(String vinNum, String brand, String type, int seats,String fuel) {
       super(vinNum, brand, type,seats);
        this.fuel = fuel;
    }

}
