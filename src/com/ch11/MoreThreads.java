package com.ch11;

public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("main Thread starting");
        MyThread3 mt1 = MyThread3.createAndStart("child #1");
        MyThread3 mt2 = MyThread3.createAndStart("child #2");
        MyThread3 mt3 = MyThread3.createAndStart("child #3");
        do {
            try {

                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Main Thread interrupted");

            }


        } while (mt1.isAlive() || mt2.isAlive() || mt3.isAlive());

    }
}
