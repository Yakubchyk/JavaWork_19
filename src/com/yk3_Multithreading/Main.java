package com.yk3_Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        MyThread thread = new MyThread();
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        Thread threadMain = new Thread();
        System.out.println("MAIN -->");
        threadMain.start();
        threadMain.join();
        thread.start();
        thread1.start();
        thread2.start();
        System.out.println("MAIN <--");
    }
}
