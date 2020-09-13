package com.ch11;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;
        thrd = Thread.currentThread();
        System.out.println("Main Thread is called : " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority());
        System.out.println();
        System.out.println("setting name and priority .\n");
        thrd.setName("thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);

        System.out.println("Main Thread is called : " + thrd.getName());
        System.out.println("Priority: " + thrd.getPriority());
//        try {
//            thrd.join();
//
//        } catch (InterruptedException e) {
//            System.out.println("Interrputed.");
//        }
    }
}
