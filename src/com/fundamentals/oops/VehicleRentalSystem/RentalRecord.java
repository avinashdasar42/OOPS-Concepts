package com.fundamentals.oops.VehicleRentalSystem;

public class RentalRecord {

    private Vehicle vehicle;
    private int rentalDays;
    private int totalDistanceTravelled;
    private double totalCost;

    public RentalRecord(Vehicle vehicle, int totalDistanceTravelled, int rentalDays) {
        this.totalDistanceTravelled = totalDistanceTravelled;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
        this.totalCost = vehicle.calculateRent(totalDistanceTravelled, rentalDays);
    }

    public void generateBill(){
        System.out.println("Vehicle: " + vehicle.getClass().getSimpleName());
        System.out.println("Distance Travelled: " + totalDistanceTravelled + " km");
        System.out.println("Total Rent: ₹" + totalCost);
    }


}
