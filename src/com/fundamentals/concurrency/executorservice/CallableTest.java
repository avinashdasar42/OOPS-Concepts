package com.fundamentals.concurrency.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Integer> submit1 = es.submit(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 10;
        });

        Future<Integer> submit2 = es.submit(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 20;
        });

        try {
            int x = submit1.get();
            int y = submit2.get();
            System.out.println("Result: "+(x+y));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        System.out.println("THIS WON'T PRINT UNTIL GET METHOD FINISHES FIRST");
        es.shutdown();
    }
}
