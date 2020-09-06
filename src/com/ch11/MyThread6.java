package com.ch11;

public class MyThread6 implements Runnable {
    Thread thrd;
    TickTock ttob;

    public MyThread6(String name, TickTock tt) {

        super();
        thrd = new Thread(this, name);
        ttob = tt;

    }

    public static MyThread6 createAndStart(String name, TickTock tt) {
        MyThread6 mythrd = new MyThread6(name, tt);
        mythrd.thrd.start();
        return mythrd;
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) {

                ttob.tick(true);
            }
            ttob.tick(false);
        } else {
            for (int i = 0; i < 5; i++) {
                ttob.tock(true);

            }
            ttob.tock(false);

        }
    }
}
