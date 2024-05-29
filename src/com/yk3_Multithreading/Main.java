package com.yk3_Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread());
        MyThread thread = new MyThread();
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        Thread threadMain = new Thread();
        threadMain.start();
        System.out.println("MAIN -->");
        int m = 10;
        for (int i = 0; i < m; i++) {
            System.out.println("MAIN " + i);
            if (i % 2 == 0) {
                System.out.println("MAIN * 2 = " + i);
            }

        }
        threadMain.join();

        thread.start();
        thread.join();
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("MAIN <--");
    }
}
