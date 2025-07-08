package com.fundamentals.oops.VehicleRentalSystem;

public abstract class Vehicle {
    private String regNumber;
    private String brand;
    private double ratePerKm;

    public Vehicle(){}

    public Vehicle(String regNumber, String brand, double ratePerKm){
        this.regNumber = regNumber;
        this.brand = brand;
        this.ratePerKm = ratePerKm;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateRent(int distance, int days);
}
