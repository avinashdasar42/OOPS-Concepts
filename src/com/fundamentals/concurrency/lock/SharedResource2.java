package com.fundamentals.concurrency.lock;

public class SharedResource2 {

    public synchronized void produce(){
        System.out.println("Lock Acquired by: "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Lock Release by: "+Thread.currentThread().getName());
    }
}
