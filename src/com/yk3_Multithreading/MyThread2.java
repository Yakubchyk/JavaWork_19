package com.yk3_Multithreading;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("T2 -->");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("T2" + i);
        }
        System.out.println("T2 <--");
    }
}
