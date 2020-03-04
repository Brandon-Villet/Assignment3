package org.example;

public class Bike extends Vehicle{

    private String color;
    private int wheels;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bike(String color, int wheels, String vinNum, String brand, String type, int seats) {
        super(vinNum, brand, type,seats);
        this.color = color;
        this.wheels = wheels;
        Car car = new Car();
        car.setFuel("Petrol");

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }









}
