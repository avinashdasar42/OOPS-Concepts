package com.fundamentals.oops.concurrency;

public class VolatileCounter {
    static volatile int counter = 0;
// This won't give correct result always hence  volatile is not recommended with counter
    public static void main(String[] args) throws InterruptedException {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter++; // NOT atomic, even if volatile
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final counter value = " + counter);
    }
}

