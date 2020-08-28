package com.ch11;

public class ExtendThread {

    public static void main(String[] args) {
        MyThread3 mt = new MyThread3("Child #1");
        mt.start();

        MyThread3 mt2 = MyThread3.createAndStart("child #2");
        MyThread3 mt3 = MyThread3.createAndStart("child #3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);

            } catch (InterruptedException exc) {
                System.out.println("Main thread interrupted .");

            }
        }
        System.out.println("Main thread ending");

    }
}

