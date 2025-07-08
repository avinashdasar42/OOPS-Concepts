package com.fundamentals.oops.HospitalManagementSystem;

public class Prescription {
    private String medicines;
    private int quantity;
    private double price;

    public Prescription(String medicines, int quantity, double price){
        this.medicines = medicines;
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getMedicines() {
        return medicines;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "medicines='" + medicines + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
