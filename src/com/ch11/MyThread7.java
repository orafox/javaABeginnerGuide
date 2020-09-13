package com.ch11;

public class MyThread7 implements Runnable {
    Thread thrd;
    boolean suspended;
    boolean stopped;

    public MyThread7(String name) {

        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;


    }

    public static MyThread7 createAndStart(String name) {
        MyThread7 myThread = new MyThread7(name);
        myThread.thrd.start();
        return myThread;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {

            for (int i = 0; i < 1000; i++) {
                System.out.print(i + " ");
                if ((i % 10) == 0) {
                    System.out.println();
                    Thread.sleep(250);

                }
                synchronized (this) {
                    while (suspended) {

                        wait();
                    }
                    if (stopped) break;
                }
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted .");
        }
        System.out.println(thrd.getName()+" existing.");
    }

    synchronized void mystop() {
        stopped =true;
        suspended = false;
        notify();
    }

    synchronized void mysyspend() {
        suspended = true;
    }

    synchronized void myresume() {
        suspended = false;
        notify();
    }
}
