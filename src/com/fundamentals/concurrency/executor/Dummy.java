package com.fundamentals.concurrency.executor;

public class Dummy {

    public void process(){
        System.out.println("Processing some requests ....."+Thread.currentThread().getName());
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void notifyUser(){
        System.out.println("Notifying users..."+Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
