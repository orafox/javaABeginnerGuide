package com.ch06;

public class QDemo2 {
    public static void main(String[] args) {
        Queue2 q1 = new Queue2(10);
        char name[] = {'T', 'o', 'm'};
        Queue2 q2 = new Queue2(name);
        char ch ;
        int i;

        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }
        Queue2 q3 = new Queue2(q1);
        System.out.print("Contents of Qq: ");
        for (i = 0; i < 10; i++) {
            ch=q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Contents of Q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);

        } System.out.println("\n");
        System.out.println("Contents of Q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);

        }
    }
}
