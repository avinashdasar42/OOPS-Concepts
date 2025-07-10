package com.fundamentals.java8.MethodReference;

import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = List.of(
                new Employee("Alice", 60000),
                new Employee("Bob", 50000),
                new Employee("Charlie", 70000)
        );

        List<Employee> employees = new ArrayList<>(list);

        //static reference
        employees.sort(Employee :: compareBySalary);
        System.out.println(employees);

        //instance reference
        Employee reference = new Employee("Reference", 55000);
        List<Employee> collect = employees.stream().filter(reference :: hasHigherSalaryThan).collect(Collectors.toList());
        System.out.println(collect);
        // reference :: hasHigherSalaryThan == emp -> reference.hasHigherSalaryThan(emp)
    }
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    public boolean hasHigherSalaryThan(Employee other) {
        return this.salary > other.salary;
    }

    public static int compareBySalary(Employee e1, Employee e2) {
        return Double.compare(e1.salary, e2.salary);
    }

    @Override
    public String toString() {
        return name + " ($" + salary + ")";
    }
}
