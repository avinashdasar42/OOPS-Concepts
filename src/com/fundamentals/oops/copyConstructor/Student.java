package com.fundamentals.oops.copyConstructor;

public class Student {
    private String name;
    private String email;
    private int age;
    private String mobile;

    public Student(){}

    public Student(Student other){
        this.name = other.name;
        this.email = other.email;
        this.age = other.age;
        this.mobile = other.mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
