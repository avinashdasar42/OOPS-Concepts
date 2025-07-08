package com.fundamentals.oops.HospitalManagementSystem;

import javax.print.Doc;
//import java.util.Date;

public class Appointment {
    private Person doctor;
    private String date;

    public Appointment(Doctor doctor, String date){
        this.doctor = doctor;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "doctor=" + doctor +
                ", date='" + date + '\'' +
                '}';
    }
}
