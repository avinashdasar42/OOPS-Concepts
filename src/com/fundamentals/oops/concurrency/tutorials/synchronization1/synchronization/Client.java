package com.fundamentals.oops.concurrency.tutorials.synchronization1.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);

//        Thread t1 = new Thread(new Adder(counter));
//        Thread t2 = new Thread(new Substractor(counter));
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
//        System.out.println(counter.getCount());

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Adder(counter));
        executorService.execute(new Substractor(counter));
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        System.out.println(counter.getCount());
    }
}
