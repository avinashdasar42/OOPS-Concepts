package com.fundamentals.oops.concurrency.practice;

public class ProducerConsumer {
    private int data;
    private boolean hasData = false; // flag to indicate data presence

    public void produce(int value) throws InterruptedException {
        while(true){
            synchronized (this){
                while (hasData) {
                    wait();
                }
                data = value;
                hasData = true;
                System.out.println("Produced: " + value);
                notify();
                value ++;
                if(value==100) break;
            }
        }
    }

    public void consume() throws InterruptedException {
        while(true){
            synchronized (this){
                while (!hasData) { // if buffer empty, wait
                    wait();
                }
                int value = data;
                hasData = false;
                System.out.println("Consumed: " + value);
                notify();
            }
        }
    }
}
