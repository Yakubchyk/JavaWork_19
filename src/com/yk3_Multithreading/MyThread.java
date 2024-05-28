package com.yk3_Multithreading;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("T -->");
        try {
            Thread.sleep(1000); //поставить поток в паузу
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("T <--");
    }
}
