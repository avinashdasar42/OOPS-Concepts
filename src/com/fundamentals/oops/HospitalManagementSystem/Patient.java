package com.fundamentals.oops.HospitalManagementSystem;

import java.util.List;

public class Patient extends Person implements Billable{
    private List<Appointment> appointments;
    private List<Prescription> prescriptions;
    public Patient(String name, int age, GENDER gender, String contactInfo, List<Appointment> appointments, List<Prescription> prescriptions) {
        super(name, age, gender, contactInfo);
        this.appointments = appointments;
        this.prescriptions = prescriptions;
    }

    @Override
    public double calculateBill() {
        double fee = 0;
        for (Prescription p : prescriptions){
            fee += p.getPrice() * p.getQuantity();
        }
        return fee;
    }

    public void printBill(){
        System.out.println("Patient: "+getName());
        System.out.println("Appointments: "+appointments);
        System.out.println("Prescriptions: "+prescriptions);
        System.out.println("Total Bill: "+calculateBill());
    }
}
