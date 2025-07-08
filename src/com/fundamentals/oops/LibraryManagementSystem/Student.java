package com.fundamentals.oops.LibraryManagementSystem;

public class Student extends User{
    private String studentId;
    public Student(String name, int age, String contact, String id) {
        super(name, age, contact);
        this.studentId = id;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                '}';
    }
}
