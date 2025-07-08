package com.fundamentals.oops.VehicleRentalSystem;

public class Customer {
    private String name;
    private String mobile;
    private RentalRecord record; //Composition >> Customer has a RentalRecord
    public Customer(String name, String mobile, RentalRecord record) {
        this.name = name;
        this.mobile = mobile;
        this.record = record;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void printInfo(){
        record.generateBill();
    }
}
