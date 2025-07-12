package com.fundamentals.java8.Streams.advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        //flatMap
        List<List<Integer>>  list = List.of(
                List.of(1,2,3,4,5),
                List.of(11,12,13,14,15)
        );

        list.stream().flatMap(l-> l.stream()).filter(n -> n%2 == 0).forEach(System.out  :: println);

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", Arrays.asList("Java", "Spring", "SQL")),
                new Employee("Bob", Arrays.asList("Python", "Django", "SQL")),
                new Employee("Charlie", Arrays.asList("Java", "Spring Boot", "AWS"))
        );

        // Get All unique skills from all employees
        List<String> uniqueSkills = employees.stream().flatMap(e-> e.getSkills().stream()).distinct().collect(Collectors.toList());
        System.out.println(uniqueSkills);
    }
}

class Employee {
    private String name;
    private List<String> skills;

    public Employee(String name, List<String> skills){
        this.name=name;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
