package com.fundamentals.oops.copyConstructor;

public class CopyConstructorTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Avinash");
        s1.setAge(28);
        s1.setEmail("xyz@gmail.com");
        s1.setMobile("9123456789");
        System.out.println(s1);

//      Shallow copy
        Student s2 = s1;//change in one object affects another object
        System.out.println(s2);
        s2.setEmail("abc@gmail.com");
        System.out.println("assigning reference: "+s1.getEmail());

//      Kind of deep copy
        Student s3 = new Student(s1);//change in one object doesn't affects another object
        System.out.println(s3);
        s3.setEmail("pqr@gmail.com");
        System.out.println("copy constructor: "+s1.getEmail());
    }
}
