package com.ch09;

public class ExcDemo {
    public static void main(String[] args) {
        int nums[] = new int[4];
        try {
            System.out.println("Before Exception is generated");
            nums[7] = 5;
            System.out.println("this will not display");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Index out-of-bounds");
        }
        System.out.println("after catch statement");
    }
}
