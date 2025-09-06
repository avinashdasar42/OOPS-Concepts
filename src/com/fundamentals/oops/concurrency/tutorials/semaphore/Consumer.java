package com.fundamentals.oops.concurrency.tutorials.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private String name;
    private int maxSize;
    private Queue<Object> objects;
    //why both semaphore?
    //when one produces, then the other will be notified to consume
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Consumer(String name, int maxSize, Queue<Object> objects, Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.name = name;
        this.maxSize = maxSize;
        this.objects = objects;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true){
            try {
                consumerSemaphore.acquire();
                if(objects.size() > 0){
                    System.out.println(name+ " : consuming : "+objects.size());
                    objects.remove();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            producerSemaphore.release();//notifying back producerThread to produce data
        }
    }
}
