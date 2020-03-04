package org.example;

public class Vehicle implements VehicleIdentity {

    protected String vinNum,brand,type;
    protected int seats;

    public Vehicle()
    {

    }

    public String getVinNum() {
        return vinNum;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }


    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Vehicle(String vinNum, String brand, String type, int seats) {
        this.vinNum = vinNum;
        this.brand = brand;
        this.type = type;
        this.seats = seats;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vinNum='" + vinNum + '\'' +
                ", brand='" + brand + '\'' +
                ", Type=" + type +
                '}';
    }


}