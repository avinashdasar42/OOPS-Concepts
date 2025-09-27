package com.fundamentals.concurrency.lock;

public class Main2 {
    public static void main(String[] args) {
        //Each Object has its own monitor lock
        SharedResource2 resource1 = new SharedResource2();
        Thread th1 = new Thread(resource1::produce);

        SharedResource2 resource2 = new SharedResource2();
        Thread th2 = new Thread(resource2::produce);

        th1.start();
        th2.start();
    }
}
