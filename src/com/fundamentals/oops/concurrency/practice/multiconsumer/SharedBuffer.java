package com.fundamentals.oops.concurrency.practice.multiconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class SharedBuffer {
    private Queue<Integer> queue;
    private int maxSize;

    public SharedBuffer(){}
    public SharedBuffer(int size){
        this.maxSize = size;
        this.queue = new LinkedList<>();
    }

    public synchronized void produces(){
        while(true){
            while(maxSize < queue.size()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Random r = new Random();
            int num = r.nextInt();
            System.out.println(Thread.currentThread().getName()+" Produces : "+num);
            queue.add(num);
            notifyAll();
        }
    }

    public synchronized void consumes(){
        while (true){
            while(queue.isEmpty()){
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Integer val = queue.poll();
            System.out.println(Thread.currentThread().getName()+" Produces : "+val);
            notifyAll();
        }
    }

}
