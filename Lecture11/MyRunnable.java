package com.Lecture11;

public class MyRunnable implements Runnable {

    private String threadName;
    private Thread thread;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        if (thread == null){
            System.out.println("Thread is ongoing: " + threadName);
            return;
        }
        System.out.println("Thread is ongoing: " + threadName);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setThread (Thread thread) {
        this.thread = thread;
    }
}
