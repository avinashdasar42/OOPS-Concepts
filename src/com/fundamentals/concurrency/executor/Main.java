package com.fundamentals.concurrency.executor;

import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args) {
//        DirectExecutor de = new DirectExecutor();
//        de.execute(()-> System.out.println("Thread: "+ Thread.currentThread().getName()+" started"));

//        Executor e = new ThreadPerTaskExecutor();
//        e.execute(()-> System.out.println("Running: "+Thread.currentThread().getName()));
//
//        Executor e2 = new ThreadPerTaskExecutor();
//        e2.execute(()-> System.out.println("Running2: "+Thread.currentThread().getName()));

        Dummy dummy = new Dummy();

        Executor e1 = new ThreadPerTaskExecutor();
        e1.execute(dummy::process);
        e1.execute(dummy::notifyUser);

        System.out.println("Thread Name: "+Thread.currentThread().getName());
    }
}
