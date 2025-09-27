package com.fundamentals.oops.concurrency.practice.publisherSubscriber;

public class Main {
    public static void main(String[] args){
        DataPackage data = new DataPackage();
        new Thread(new Publisher(data)).start();
        new Thread(new Subscribers(data, "C1")).start();
        new Thread(new Subscribers(data, "C2")).start();
    }
}
