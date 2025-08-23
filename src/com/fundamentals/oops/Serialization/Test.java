package com.fundamentals.oops.Serialization;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Person p = new Person("John",30);

        //1. You can use any file extension — .txt, .bin, .data, or even no extension at all.
        // But .ser extension is preferred
        //2. When Person class doesn't implement Serializable >> Exception in thread "main"
        // java.io.NotSerializableException: com.fundamentals.oops.Serialization.Person
        //3. After implementing Serializable, no issue
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/DELL/Downloads/SerializableTest/person.txt"));
        oos.writeObject(p);
        oos.close();

        //Read
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("C:/Users/DELL/Downloads/SerializableTest/person.txt")
        );
        // Read the object and cast it to the appropriate type
        Person personReadObject = null;
        try {
            personReadObject = (Person) ois.readObject();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Close the stream
        ois.close();

        // Use the object
        System.out.println("Person details: "+personReadObject);
        System.out.println("Name: " + personReadObject.getName());
    }
}

class Person implements Serializable {
//class Person {
    private String name;
//    transient int age;//try this to understand
    private int age;
    public Person(){};
    public Person(String name, int age){
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
