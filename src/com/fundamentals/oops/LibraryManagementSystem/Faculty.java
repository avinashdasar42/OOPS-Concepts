package com.fundamentals.oops.LibraryManagementSystem;

public class Faculty extends User{
    private String facultyId;
    public Faculty(String name, int age, String contact, String id) {
        super(name, age, contact);
        this.facultyId = id;
    }

    public String getFacultyId() {
        return facultyId;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyId='" + facultyId + '\'' +
                '}';
    }
}
