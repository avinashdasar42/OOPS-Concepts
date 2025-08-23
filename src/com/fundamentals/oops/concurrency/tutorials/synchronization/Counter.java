package com.fundamentals.oops.concurrency.tutorials.synchronization;

public class Counter {
    private int count;

    public Counter(int count){
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public synchronized void addValue(int offset){
        count += offset;
    }
}
