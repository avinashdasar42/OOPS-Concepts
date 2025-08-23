package com.fundamentals.oops.concurrency.tutorials.mutex;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{

    private String name;
    private int maxSize;
    private Queue<Object> objects;
    private Lock lock;

    public Producer(String name, int maxSize, Queue<Object> objects, Lock lock){
        this.name = name;
        this.maxSize = maxSize;
        this.objects = objects;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true){
//            one thread will enter at a time
            lock.lock();
            if(objects.size() < maxSize){
                System.out.println(name+" producing : "+ objects.size());
                objects.add(new Object());
            }
            lock.unlock();
        }
    }
}
