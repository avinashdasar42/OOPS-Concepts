package com.fundamentals.oops.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReferenceTest {
    public static void main(String[] args) {
        final Customer c1 = new Customer("John");
        final Customer c2 = new Customer("Jane");
        CustomerRecords cr = new CustomerRecords();
        cr.addCustomer(c1);cr.addCustomer(c2);

        Iterator<Customer> customers = cr.getCustomers();
        for (Iterator<Customer> it = customers; it.hasNext(); ) {
            Customer cc = it.next();
            System.out.println(cc);
        }
        System.out.println("result1: "+customers);
        customers.remove();
        System.out.println("result2: "+customers);
    }
}

class CustomerRecords implements Iterator<Customer> {
    private Map<String, Customer> records;

    public CustomerRecords(){
        this.records = new HashMap<>();
    }

    public void addCustomer(Customer customer){
        this.records.put(customer.getName(),customer);
    }

    public Iterator<Customer> getCustomers(){
        return this.records.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Customer next() {
        return null;
    }
}

class Customer{
    private String name;
    private int age;

    public Customer(){}

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
