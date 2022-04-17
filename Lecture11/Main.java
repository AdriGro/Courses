package com.Lecture11;

public class Main{
    public static void main(String[] args) throws InterruptedException{

        MyRunnable mr = new MyRunnable("First");
        MyRunnable mr2 = new MyRunnable("Second");
        MyRunnable mr3 = new MyRunnable("Third");

        Thread th1 = new Thread(mr);
        Thread th2 = new Thread(mr2);
        Thread th3 = new Thread(mr3);

        mr3.setThread(th2);
        mr2.setThread(th1);

       th3.start();
       th3.join();

    }
}
