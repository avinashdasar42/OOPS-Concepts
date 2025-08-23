package com.fundamentals.oops.concurrency.tutorials.synchronization;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);

        Thread t1 = new Thread(new Adder(counter));
        Thread t2 = new Thread(new Substractor(counter));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}
