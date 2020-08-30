package com.ch11;

public class MyThread4 implements Runnable {

    Thread thrd ;

    public MyThread4(String name) {
        thrd = new Thread(this,name);


            }

    public static MyThread4 createAndStart(String name) {
        MyThread4 mt = new MyThread4(name);
        mt.thrd.start();
        return mt;
    }
    @Override
    public void run() {
        System.out.println(thrd.getName() + " stating");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println(" in " + thrd.getName() + " , count is  " + count);
            }
        } catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted . ");
        }
        System.out.println(thrd.getName() + " terminatiing");

    }
}
