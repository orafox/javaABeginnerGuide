package com.ch11;

public class Suspend {
    public static void main(String[] args) {
        MyThread7 mt1 = MyThread7.createAndStart("my Thread");
        try {
            Thread.sleep(1000);
            mt1.mysyspend();
            System.out.println("Suspendinb thread");
            Thread.sleep(1000);
            mt1.myresume();
            System.out.println("resuming thread");
            Thread.sleep(1000);
            mt1.mysyspend();
            System.out.println("suspending thread.");
            Thread.sleep(1000);
            mt1.myresume();
            System.out.println("reusming thread");
            Thread.sleep(1000);

            mt1.mysyspend();
            System.out.println("suspending thread.");
            mt1.mystop();
        } catch (InterruptedException e) {
            System.out.println("main thread interrputed.");

        }
        try {
            mt1.thrd.join();
        } catch (InterruptedException e) {

            System.out.println("main thread Interrputed");

        }
    }
}
