package com.ch09;

public class GenQDemo {
    public static void main(String[] args) {
        Integer IStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(IStore);
        Integer iVal;
        System.out.println("Demonstrate q queue of Integer");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Adding " + i + "to q.");
                q.put(i);
            }

        } catch (QueueFullException ex) {
            System.out.println(ex);

        }
        System.out.println();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("getting next Integer form q:");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch (QueueEmptyException exception) {
            System.out.println(exception);
        }
        System.out.println();
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<>(dStore);
        Double dVal;
        System.out.println("demonstrate q queue of doubels");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("adding " + (double) i / 2 + " to q2");
                q2.put((double) i / 2);
            }
        } catch (QueueFullException e) {
            System.out.println(e);
        }

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("getting next double from q2:");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch (QueueEmptyException e) {
            System.out.println(e);
        }

    }
}
