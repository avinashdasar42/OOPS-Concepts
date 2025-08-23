package com.fundamentals.oops.concurrency;

public class VolatileTest {
    //Volatile keyword is suitable for flag/status change
    //Not recommended for incremental/decremental counter
    static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println("Worker started...");
            while (flag) { // might keep reading old value from cache
                // Busy loop
                System.out.println("In Loop");
            }
            System.out.println("Worker stopped!");
        });

        worker.start();

        Thread.sleep(2000); // let worker run for 2 seconds
        System.out.println("Main thread setting flag = false");
        flag = false; // update might not be visible immediately
    }
}
