package com.ch11;

public class ThreadVariations {
    public static void main(String[] args) {

        System.out.println("Main Thread starting ");


        MyThread2 mt = MyThread2.createAndStart("Chiled #1");
        for (int i = 0; i < 50; i++) {
            System.out.println(".");
            try {
                Thread.sleep(100);


            } catch (InterruptedException exception) {
                System.out.println("Main thread interrupted");

            }
            System.out.println("main thread ending");

        }

    }
}
