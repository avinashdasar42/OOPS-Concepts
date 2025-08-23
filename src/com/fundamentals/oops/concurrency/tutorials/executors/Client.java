package com.fundamentals.oops.concurrency.tutorials.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

//        for(int i=1; i<100; i++){
//            PrintNumberTask task = new PrintNumberTask(i);
//            Thread thread = new Thread(task);
//            thread.start();
//        }

        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i=1; i<100; i++){
            PrintNumberTask task = new PrintNumberTask(i);

            if(i==50){
                System.out.println("Debugging.....");
            }

            es.execute(task);
        }
        es.shutdown();
    }
}
