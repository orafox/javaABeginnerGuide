package com.ch11;

public class JoinThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        MyThread4 mt1 = MyThread4.createAndStart("child #1");
        MyThread4 mt2 = MyThread4.createAndStart("child #2");
        MyThread4 mt3 = MyThread4.createAndStart("child #3");
        try {
            mt1.thrd.join();
            System.out.println("child #1 joind.");
            mt2.thrd.join();
            System.out.println("child #2 joind.");


            mt3.thrd.join();
            System.out.println("child #3 joind.");

        } catch (InterruptedException exc) {
            System.out.println("main Thread interrupted");

        }
        System.out.println("main thred ending.");

    }
}
