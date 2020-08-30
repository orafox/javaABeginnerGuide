package com.ch11;

public class Sync {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        MyThreadSync mt1 = MyThreadSync.CreateAndStart("child #1", a);
        MyThreadSync mt2 = MyThreadSync.CreateAndStart("child #2", a);
        try {
            mt1.thrd.join();
            mt2.thrd.join();

        } catch (InterruptedException exc) {
            System.out.println("Main thread interrputed");

        }
    }
}
