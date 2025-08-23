package com.fundamentals.oops.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListTest {
    public static void main(String[] args) throws InterruptedException {
//        List<Integer> nums = new CopyOnWriteArrayList<>(); works fine
        List<Integer> nums = new ArrayList<>(); //inconsistent results
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1; i<5;i++) {
                    nums.add(i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=5; i<10;i++) {
                    nums.add(i);
                }
            }
        });

        t1.start();
        t2.start();

//        Thread.sleep(2000);
        t1.join();
        t2.join();
        System.out.println("Result: "+nums);
    }
}
