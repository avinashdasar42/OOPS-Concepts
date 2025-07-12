package com.fundamentals.java8.Streams.intermediate;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        // Find the first string with length > 5
        List<String> names = List.of("John","James","Jimmy","Jennifer","Avinash","Kylie");
        Optional<String> first = names.stream().filter(n-> n.length() > 5).findFirst();
        first.ifPresent(System.out :: println);

        Employee e1 = new Employee("John",29,1000000,"Programmer");
        Employee e2 = new Employee("James",22,400000,"Tester");
        Employee e3 = new Employee("Jimmy",30,1500000,"Programmer");
        Employee e4 = new Employee("Kylie",24,500000,"Analyst");

        //Sort Employee by salary desc
        List<Employee> emps = Arrays.asList(e1,e2,e3,e4);
        Comparator<Employee> comparator = Comparator.comparingDouble(Employee::getSalary).reversed();
        emps.sort(comparator);
        System.out.println(emps);

        //Group by dept
//        Map<String, List<Employee>> employeesByDept = emps.stream()
//                .collect(Collectors.groupingBy(Employee::getDept));
//        System.out.println(employeesByDept);

        //Partition By Age >= 25
        Map<Boolean, List<Employee>> collect = emps.stream().collect(Collectors.partitioningBy(e -> e.getAge() >= 25));
        System.out.println(collect);
    }
}

class Employee{
    private String name;
    private int age;
    private double salary;
    private String dept;

    public Employee(String name, int age, double salary, String dept) {
        this.name = name;
        this.age = age;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
