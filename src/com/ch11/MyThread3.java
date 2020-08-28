package com.ch11;

public class MyThread3 extends Thread {
    public MyThread3(String name) {

        super(name);
    }

    static MyThread3 createAndStart(String name) {
        MyThread3 mt = new MyThread3(name);
        mt.start();
        return  mt;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(getName() + " starting.");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("in " + getName() + " , count is " + i);
            }
        } catch (InterruptedException exc) {
            System.out.println(getName() + " interrputed");
        }
        System.out.println(getName() + " terminating.");
    }
}
