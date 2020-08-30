package com.ch11;

public class MyThreadSync implements Runnable{
    Thread thrd ;
    static  SumArray sa = new SumArray();
    int a[];
    int answer;

    public MyThreadSync(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
    }

    public static MyThreadSync CreateAndStart(String name, int nums[]) {
        MyThreadSync myThrd = new MyThreadSync(name, nums);
        myThrd.thrd.start();
        return myThrd;
    }

    @Override
    public void run() {
        int sum;
        System.out.println(thrd.getName() + " starting .");
        answer = sa.SumArray(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminting.");

    }

}
