package com.fundamentals.oops.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    static AtomicInteger counter = new AtomicInteger(0);
//This will give correct results always
    public static void main(String[] args) throws InterruptedException {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet(); // atomic operation
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final counter value = " + counter); // Always 2000
    }
}

