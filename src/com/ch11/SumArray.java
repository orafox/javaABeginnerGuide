package com.ch11;

public class SumArray {

    private int sum;

   synchronized
    int SumArray(int nums[]) {
        sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for "
                    + Thread.currentThread().getName() + " is " + sum);

            try {
                Thread.sleep(10);

            } catch (InterruptedException exc) {
                System.out.println("Thread interputed");

            }


        }
        return sum;
    }
}
