package com.ch01;

public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {

            switch (i) {
                case 0 :
                    System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is tow");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("five or more");

            }
        }
    }
}
