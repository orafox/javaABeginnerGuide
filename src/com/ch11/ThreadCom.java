package com.ch11;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt= new TickTock();
        MyThread6 mt1 = MyThread6.createAndStart("Tick", tt);
        MyThread6 mt2 = MyThread6.createAndStart("Tock", tt);
        try {
            mt1.thrd.join();
            mt2.thrd.join();

        } catch (InterruptedException exc) {
            System.out.println("Main Thread interrputed");

        }
    }
}
