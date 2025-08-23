package com.fundamentals.oops.concurrency.wait_notify;

public class SharedBuffer {
    private int data;
    private boolean hasData = false; // flag to indicate data presence

    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) { // if buffer full, wait
            wait();
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // wake up consumer
    }

    public synchronized int consume() throws InterruptedException {
        while (!hasData) { // if buffer empty, wait
            wait();
        }
        int value = data;
        hasData = false;
        System.out.println("Consumed: " + value);
        notify(); // wake up producer
        return value;
    }
}
