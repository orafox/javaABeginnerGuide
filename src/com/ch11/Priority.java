package com.ch11;

public class Priority implements Runnable {
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;

    public Priority(String name) {

        thrd = new Thread(this, name);
        count = 0;
        currentName = name;


    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do {
            count++;
            if (currentName.compareTo(thrd.getName()) != 0) {
                currentName = thrd.getName();
                System.out.println("in " + currentName);
                System.out.println(count);
            }
        } while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + thrd.getName() + " terminating.");
    }
}
