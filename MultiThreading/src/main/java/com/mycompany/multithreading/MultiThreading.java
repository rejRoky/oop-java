package com.mycompany.multithreading;

class MyThread extends Thread {

    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
        }

    }
}

public class MultiThreading {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        
        int i = 1;
        while (true) { 
            System.out.println(i + " World");
        }

    }
}
