package com.mycompany.multithreading;

class MyThread implements Runnable { // Runnable is a Thread Interface 

    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }

    }
}

public class MultiThreading {

    public static void main(String[] args) {

        MyThread r = new MyThread(); // implements Interface 
        Thread t = new Thread(r);
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }

    }
}
