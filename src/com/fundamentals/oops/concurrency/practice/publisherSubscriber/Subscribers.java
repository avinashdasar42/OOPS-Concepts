package com.fundamentals.oops.concurrency.practice.publisherSubscriber;

public class Subscribers implements Runnable{
    private final DataPackage data;
    private final String name;
    Subscribers(DataPackage d, String n) { this.data = d; this.name = n; }

    @Override
    public void run() {
        while (true) {
            synchronized (data) {
                while (!data.flag) {
                    try { data.wait(); } catch (InterruptedException ignored) {}
                }
                System.out.println(name + " consumed: " + data.value);
                data.flag = false;
                data.notifyAll();
            }
        }
    }
}
