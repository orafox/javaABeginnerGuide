package com.ch05;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;
        for (i = 0; i < 26; i++) {
            bigQ.put((char) ('A' + i));
        }
        System.out.print("contents of BigQ: ");
        for (i = 0; i < 26; i++) {
            ch = bigQ.get();
            if (ch != (char) 0) System.out.println(ch);
        }
        System.out.println("\n");
        for (i = 0; i < 5; i++) {
            System.out.print("attempting to store " + (char) ('z' - i));
            smallQ.put((char) ('z' - i));
            System.out.println();
        }
        System.out.println();
        for (i = 0; i < 5; i++) {
            ch = smallQ.get();
            if ((ch != (char) 0)) System.out.print(ch);
        }
    }
}
