package com.fundamentals.oops.concurrency.tutorials.mutex;

import java.util.Queue;
import java.util.concurrent.locks.Lock;

public class Consumer implements Runnable{

    private String name;
    private int maxSize;
    private Queue<Object> objects;
    private Lock lock;

    public Consumer(String name, int maxSize, Queue<Object> objects, Lock lock){
        this.name = name;
        this.maxSize = maxSize;
        this.objects = objects;
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true){
            lock.lock();
            if(objects.size() > 0){
                System.out.println(name+ " : consuming : "+objects.size());
                objects.remove();
            }
            lock.unlock();
        }
    }
}
