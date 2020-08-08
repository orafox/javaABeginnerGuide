package com.ch01;

public class Break4 {
    public static void main(String[] args) {
        one:
        {
            tow:
            {
                three:
                {
                    for (int i = 1; i < 4; i++) {
                        System.out.println("\ni is " + i);
                        if (i == 1) break one;
                        if (i == 2) break tow;
                        if (i == 3) break three;
                        System.out.println("this never print");
                    }
                    System.out.println("after block three");
                }
                System.out.println("after block tow");
            }
            System.out.println("after block three");
        }
        System.out.println("after for.");
    }
}
