package com.fundamentals.oops.HospitalManagementSystem;

public class Doctor extends Person{
    private String speciliasation;
    public Doctor(String name, int age, GENDER gender, String contactInfo, String speciliasation) {
        super(name, age, gender, contactInfo);
        this.speciliasation = speciliasation;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "speciliasation='" + speciliasation + '\'' +
                '}';
    }
}
