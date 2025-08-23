package com.fundamentals.oops.concurrency.tutorials.synchronization1.synchronization;

public class Substractor implements Runnable{
    private Counter counter;

    public Substractor(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=1;i<100001;i++){
            synchronized (counter){
                counter.addValue(-i);
            }
        }
    }
}
