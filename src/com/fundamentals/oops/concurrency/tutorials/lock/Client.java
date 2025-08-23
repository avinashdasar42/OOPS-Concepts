package com.fundamentals.oops.concurrency.tutorials.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);
        Lock lock = new ReentrantLock();

        Thread t1 = new Thread(new Adder(counter,lock));
        Thread t2 = new Thread(new Substractor(counter,lock));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
