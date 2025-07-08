package com.fundamentals.oops.LibraryManagementSystem;

public class Librarian extends User{
    private String id;
    public Librarian(String name, int age, String contact, String id) {
        super(name, age, contact);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
