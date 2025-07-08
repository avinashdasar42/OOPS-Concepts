package com.fundamentals.oops.deepAndShallowCopy;

public class MainTest {
    public static void main(String[] args) {
        Address address1 = new Address("Pune","411507");
        Person p1 = new Person("John Doe", address1);

//      Test shallow copy
//      Though new object
//        Person p2 = new Person(p1);
//        p2.getAddress().setCity("Mumbai");
////      Here p1 != p2 but p1.address() == p2.address() (both hv same reference)
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p1.getAddress() == p2.getAddress());
//        System.out.println(p1.getAddress().getCity());
//        System.out.println(p2.getAddress().getCity());
        System.out.println("-----------------------------");
//      Test Deep Copy
//        Person p3 = new Person(p1);
//        p3.getAddress().setCity("Delhi");
//      Here p1 != p3 and p1.address() != p3.address()
//        System.out.println(p1.getAddress() == p3.getAddress());
//        System.out.println(p1.getAddress().getCity());
//        System.out.println(p3.getAddress().getCity());

    }
}
