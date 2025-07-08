package com.fundamentals.oops.LibraryManagementSystem;

public class User {
    private String name;
    private int age;
    private String contact;

    public User(String name, int age, String contact){
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", contact='" + contact + '\'' +
                '}';
    }
}
