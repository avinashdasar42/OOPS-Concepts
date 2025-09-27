package com.fundamentals.concurrency.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
    public static void main(String[] args) throws ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<String> f1 = es.submit(() -> {
            //some heavy task
            Thread.sleep(3000);
            System.out.println("Print msg by New thread1: "+Thread.currentThread().getName());
            return "Hello";
        });

        try {
            String str1 = f1.get();
            System.out.println("Result: "+str1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Future<String> f2 = es.submit(() -> {
            //some heavy task
            Thread.sleep(3000);
            System.out.println("Print msg by New thread2: "+Thread.currentThread().getName());
            return " World";
        });

        System.out.println("Print this msg by thread: "+Thread.currentThread().getName());
        try {
            String str2 = f2.get();
            System.out.println("Result: "+str2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        es.shutdown();
    }
}
