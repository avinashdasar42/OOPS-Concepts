package com.fundamentals.oops.concurrency.tutorials.semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{

    private String name;
    private int maxSize;
    private Queue<Object> objects;
    //why both semaphore?
    //when one produces, then the other will be notified to consume
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(String name, int maxSize, Queue<Object> objects, Semaphore producerSemaphore, Semaphore consumerSemaphore){
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
                producerSemaphore.acquire();//starts producing i.e. number of thread will trying to access produces will become maxSize-1
                if(objects.size() < maxSize){
                    System.out.println(name+" producing : "+ objects.size());
                    objects.add(new Object());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            consumerSemaphore.release();//starts consuming i.e. notifying consumerThread / number of threads trying to consume will increase by 1 (initially we define it 0 now it will become 1)
        }
    }
}
