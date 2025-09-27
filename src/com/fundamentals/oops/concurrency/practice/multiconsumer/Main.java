package com.fundamentals.oops.concurrency.practice.multiconsumer;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer sb = new SharedBuffer(5);

        Thread t1 = new Thread(sb::produces, "producerThread");

        Thread.sleep(500);
        Thread t2 = new Thread(sb::consumes, "consumerThread1");
        Thread t3 = new Thread(sb::consumes, "consumerThread2");

        t1.start();
        t2.start();
        t3.start();

        Executor e = null;
    }
}
