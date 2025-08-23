package com.fundamentals.oops.concurrency.tutorials.executors;

public class PrintNumberTask implements Runnable{

    private final int num;

    public PrintNumberTask(int num){
        this.num = num;
    }
    @Override
    public void run() {
        System.out.println(num+" Thread name: "+Thread.currentThread().getName());
    }
}
