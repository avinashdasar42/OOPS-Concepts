package com.fundamentals.java8.DefaultAndStatic;

public class TestStatic {
    public static void main(String[] args) {
        // I can directly access static method using interface name
        System.out.println(Vehicle.milege());
//        System.out.println(Vehicle.horsePower()); // But default method can't be access directly
        Vehicle v = new VehicleImpl();
        System.out.println(v.horsePower());
//        System.out.println(v.milege()); this is not possible
    }
}

interface Vehicle{
    static int milege(){
        return 100;
    }
    default int horsePower(){
        return 720;
    }
}

class VehicleImpl implements Vehicle{
    static int cost(){
        return 150000;
    }
}