package com.yk3_Multithreading;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("T1 -->");
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("T1 <--");
    }
}
