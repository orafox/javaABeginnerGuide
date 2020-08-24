package com.ch11;

public class UseThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting .");
        MyThread mt = new MyThread("Child #1");
        Thread newThrd = new Thread(mt);
        newThrd.start();
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);

            } catch (InterruptedException exception) {
                System.out.println("main 22 thread interrputed");

            }

        }
        System.out.println("main thread ending");
    }
}
