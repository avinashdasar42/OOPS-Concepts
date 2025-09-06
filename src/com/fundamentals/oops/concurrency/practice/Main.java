package com.fundamentals.oops.concurrency.practice;

import com.fundamentals.oops.concurrency.tutorials.mutex.Producer;

public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(()->{
            try {
                pc.produce(0);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumerThread = new Thread(()->{
            try {
                pc.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
