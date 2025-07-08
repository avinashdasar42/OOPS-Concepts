package com.fundamentals.oops.VehicleRentalSystem;

public class Scooter extends TwoWheelerVehicle{
    public Scooter(String regNumber, String brand, double ratePerKm) {
        super(regNumber, brand,  ratePerKm);
    }

    @Override
    public double calculateRent(int distance, int days) {
        return distance * getRatePerKm() * days;
    }
}
