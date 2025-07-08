package com.fundamentals.oops.HospitalManagementSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Rao", 35, GENDER.FEMALE, "9123456789","Cardiologist");

        Appointment appointment1 = new Appointment(doctor,"2025-07-11");
        Appointment appointment2 = new Appointment(doctor,"2025-07-12");

        Prescription prescription1 = new Prescription("Vitamin B",6,10);
        Prescription prescription2 = new Prescription("Crossin",4,8);

        Patient patient = new Patient("John",24, GENDER.MALE, "1234567890", Arrays.asList(appointment1,appointment2), Arrays.asList(prescription1,prescription2));
        patient.printBill();
    }

}
