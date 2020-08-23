package com.ch11;

public class MyThread implements Runnable {
    String thrdName;

    public MyThread(String name) {
        this.thrdName = name;

    }

    @Override
    public void run() {
        System.out.println(thrdName + " starting ");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("in " + thrdName + ", count is " + count);
            }
        } catch (InterruptedException exception) {
            System.out.println(thrdName + " interrputed ");
        }
        System.out.println(thrdName + " terminating ");

    }
}
