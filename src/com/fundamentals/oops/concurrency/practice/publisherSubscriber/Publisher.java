package com.fundamentals.oops.concurrency.practice.publisherSubscriber;

public class Publisher implements Runnable{
    private final DataPackage data;
    Publisher(DataPackage d) { this.data = d; }

    @Override
    public void run() {
        while (true) {
            synchronized (data) {
                while (data.flag) {
                    try { data.wait(); } catch (InterruptedException ignored) {}
                }
                data.value++;
                System.out.println("Produced: " + data.value);
                data.flag = true;
                data.notifyAll();
            }
        }
    }
}
