package com.example.completablefuture.service;

public class Runable implements Runnable{
    @Override
    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running in " + threadName);
            Thread.sleep(5000);
            System.out.println("Finish in " + threadName);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
