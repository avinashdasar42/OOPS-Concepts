package com.fundamentals.oops.concurrency.tutorials.lock;

import java.util.concurrent.locks.Lock;

public class Substractor implements Runnable{
    private Counter counter;
    private Lock lock;

    public Substractor(Counter counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=1;i<10000;i++){
            lock.lock();
            //handle this critical section
            counter.count -= i;
            lock.unlock();
        }
    }
}
