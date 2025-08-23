package com.fundamentals.oops.concurrency.tutorials.mutex;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        int maxSize = 6;
        Queue<Object> objects = new ConcurrentLinkedQueue<>();
        Producer p = new Producer("Producer", maxSize, objects, lock);
        Consumer c = new Consumer("Consumer",0, objects, lock);

        Thread t1 = new Thread(p,"t1");
        Thread t2 = new Thread(p,"t2");
        Thread t3 = new Thread(p,"t3");
        t1.start();
        t2.start();
        t3.start();

        Thread t4 = new Thread(c,"t4");
        Thread t5 = new Thread(c,"t5");
        Thread t6 = new Thread(c,"t6");
        Thread t7 = new Thread(c,"t7");
        Thread t8 = new Thread(c,"t8");
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
