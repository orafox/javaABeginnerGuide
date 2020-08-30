package com.ch11;

public class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("high Priority");
        Priority mt2 = new Priority("low Priority");
        Priority mt3 = new Priority("Normal Priority#1");
        Priority mt4 = new Priority("Normal Priority#2");
        Priority mt5 = new Priority("Normal Priority#3");
        mt1.thrd.setPriority(Thread.NORM_PRIORITY + 2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY - 2);

        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();
        mt4.thrd.start();
        mt5.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
            mt4.thrd.join();
            mt5.thrd.join();
        } catch (InterruptedException exc) {
            System.out.println("Main thread interrpted.");

        }
        System.out.println("\nHigh Priority thread counted to " + mt1.count);
        System.out.println("\nlow Priority thread counted to " + mt2.count);
        System.out.println("\n1st Normal Priority thread counted to " + mt3.count);
        System.out.println("\n2nd Normal Priority thread counted to " + mt4.count);
        System.out.println("\n3rd Normal Priority thread counted to " + mt5.count);

    }



}
