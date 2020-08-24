package com.ch11;

public class MyThread2 implements Runnable {
    Thread thrd;

    public MyThread2(String name) {

        thrd = new Thread(this, name);

    }

    public static MyThread2 createAndStart(String name) {
        MyThread2 myThrd = new MyThread2(name);
        myThrd.thrd.start();
        return myThrd;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " Starting");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(" IN " + thrd.getName() + " , count is " + count);
            }
        } catch (InterruptedException exception) {
            System.out.println(thrd.getName() + " interrupted .");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
