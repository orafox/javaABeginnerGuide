package com.ch08;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        DynQueue q2 = new DynQueue(5);
        CircularQueue q3 = new CircularQueue(10);
        ICharQ IQ;
        char ch;
        int i;
        IQ =q1;
        for ( i = 0; i < 10; i++) {
            IQ.put((char) ('A' + i));
        }
        System.out.print("Contents of fixed queue :");
        for (i = 0; i < 10; i++) {
            ch = IQ.get();
            System.out.print(ch);
        }
        System.out.println();
        IQ =q2;
        for ( i = 0; i < 10; i++) {
            IQ.put((char) ('Z' + i));
        }
        System.out.print("Contents of dynamic queue :");
        for (i = 0; i < 10; i++) {
            ch = IQ.get();
            System.out.print(ch);
        }
        System.out.println();

        IQ= q3;
        for (i = 0; i < 10; i++) {
            IQ.put((char) ('A' + 1));
        }
        System.out.print("contents of circular queue");
        for (i = 0; i < 10; i++) {
            ch = IQ.get();
            System.out.print(ch);
        }

        System.out.println();
        for (i = 0; i < 20; i++) {
            IQ.put((char) ('A' + i));
        }
        System.out.print("contents of circular queue");
        for (i = 0; i < 10; i++) {
            ch= IQ.get();
            System.out.print(ch);

        }
        System.out.print("\nStore and consume from " + " circular queue.");
        for (i = 0; i < 20; i++) {
            IQ.put((char)('A'+1));
            ch= IQ.get();
            System.out.print(ch);

        }
    }
}
