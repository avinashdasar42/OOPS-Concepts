package com.fundamentals.concurrency.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //creates ES with thread pool size = 2
        //ExecutorService es = Executors.newFixedThreadPool(2);
        //we can submit tasks to ES which internally using queue based data structure to allocate these
        //tasks based on threads availability

        //this submitted tasks will run in async
//        es.submit(()->{
//            int a = 10, b = 12;
//            System.out.println("Task1: sum: "+(a+b));
//        });
//        es.submit(()-> System.out.println("Task2"));

        //compulsory to shut down
//        es.shutdown();

        long initial = Runtime.getRuntime().totalMemory();
        long max = Runtime.getRuntime().maxMemory();
        System.out.println("Initial Heap: " + initial/1024/1024 + " MB");
        System.out.println("Max Heap: " + max/1024/1024 + " MB");
    }
}
