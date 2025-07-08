package com.fundamentals.oops.deepAndShallowCopy;

public class Person {

    private String name;
    private Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

//    public Person(Person other){
//        this.name = other.name;
//        this.address = other.address; // shallow copy
//    }

    public Person(Person other){
        this.name = other.name;
        this.address = new Address(other.address.getCity(),other.address.getPincode()); // deep copy
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
