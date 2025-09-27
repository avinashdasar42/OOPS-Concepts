package com.fundamentals.concurrency.lock;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(new LinkedList<>(), 3);

        Thread producerThread = new Thread(()->{
            for(int i=1; i<=6; i++){
                resource.produce(i);
            }
        });

        Thread consumerThread = new Thread(()->{
            for(int i=1; i<=6; i++){
                resource.consume();
            }
        });

        consumerThread.start();
        producerThread.start();
    }
}
