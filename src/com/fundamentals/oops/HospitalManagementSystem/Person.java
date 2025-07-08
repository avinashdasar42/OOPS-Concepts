package com.fundamentals.oops.HospitalManagementSystem;

public abstract class Person {
    private String name;
    private int age;
    private String contactInfo;
    private GENDER gender;
    public Person(String name, int age, GENDER gender, String contactInfo){
        this.name=name;
        this.age = age;
        this.gender = gender;
        this.contactInfo=contactInfo;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public GENDER getGender() {
        return gender;
    }
}
