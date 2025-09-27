package com.fundamentals.concurrency.lock;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> queue;
    private int bufferSize;

    public SharedResource(Queue<Integer> queue, int bufferSize){
        this.queue = queue;
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item){
        while(queue.size() == bufferSize){
            System.out.println("Queue is full, Consumer can proceed");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        queue.add(item);
        System.out.println("Item produced: "+item+" by Thread: "+Thread.currentThread().getName());
        notify();
    }

    public synchronized void consume(){
        while(queue.isEmpty()){
            System.out.println("Queue is empty, Producer can proceed now");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        int item = queue.poll();
        System.out.println("Item consumed: "+item+" by Thread: "+Thread.currentThread().getName());
        notify();
    }
}
