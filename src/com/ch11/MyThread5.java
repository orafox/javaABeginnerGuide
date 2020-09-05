package com.ch11;

public class MyThread5 implements Runnable {
    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    MyThread5(String name, int num[]) {
        thrd = new Thread(this, name);
        a=num;
    }

    public static MyThread5 createAndStart(String name, int nums[]) {
        MyThread5 mythred = new MyThread5(name, nums);
        mythred.thrd.start();
        return mythred;
    }

    @Override
    public void run() {
        int sum ;
        System.out.println(thrd.getName() + " starting. ");
        synchronized (sa) {
            answer = sa.SumArray(a);

        }
        System.out.println("Sum for " + thrd.getName() + " " + answer);
        System.out.println(thrd.getName() + " terminating.");

    }
}
