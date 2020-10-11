package com.ch09;

public class UseFinally {
    public static void genException(int what) {
        int t ;
        int nums[] = new int[2];
        System.out.println("Receiving " + what);
        try {
            switch (what) {
                case 0:
                    t = 10/what;
                    break;
                case 1:
                    nums[4] = 4;
                    break;
                case 2:
                    return;
            }

        } catch (ArithmeticException exception) {
            System.out.println("can't divide by zero");
            return;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("no Matching element found");

        }
        finally {
            System.out.println("Leaving try");

        }
    }
}
