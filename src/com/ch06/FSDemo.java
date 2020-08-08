package com.ch06;

public class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
        System.out.println("Fail Quietly");
        for (int i = 0; i < (fs.legnth * 2); i++) {
            fs.put(i, i * 10);



        }
        for (int i = 0; i < (fs.legnth * 2); i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x+" ");
            }
        }
        System.out.println("");
        System.out.println("\nFail with error reports .");
        for (int i = 0; i < fs.legnth * 2; i++) {
            x = fs.get(i);
            if (x != -1) {
                System.out.print(x + " ");
            } else {
                System.out.println("index " + i + " out-of-bounds");
            }
        }
    }
}
