package com.fundamentals.oops.concurrency.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        executor.execute(() -> System.out.println("Hello World1: "+Thread.currentThread().getName()));
        executor.execute(() -> System.out.println("Hello World2: "+Thread.currentThread().getName()));

        System.out.println("Main: "+Thread.currentThread().getName());

//        ExecutorService
    }
}
