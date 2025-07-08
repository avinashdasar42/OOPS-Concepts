package com.fundamentals.oops.VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new FiveSeaterVehicle("MH21 1440", "Balero",20);
        RentalRecord record = new RentalRecord(vehicle,1000,2);
        Customer customer = new Customer("John","1234567890",record);
        customer.printInfo();
    }
}
