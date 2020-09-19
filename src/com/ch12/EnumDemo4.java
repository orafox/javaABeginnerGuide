package com.ch12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp,tp1,tp2,tp3;
        System.out.println("here are all transport contains "+
                "and their ordinal values");
        for (Transport t : Transport.values()) {
            System.out.println(t + " " + t.ordinal());
        }

        tp= Transport.AIRPLAN;
        tp2 = Transport.TRAIN;
        tp3=Transport.AIRPLAN;
        System.out.println();
        if (tp.compareTo(tp2) < 0) {
            System.out.println(tp + " comes before " + tp2);

        }
        if (tp.compareTo(tp2) > 0) {
            System.out.println(tp2 + " comes before " + tp);
        }
        if (tp.compareTo(tp3) == 0) {
            System.out.println(tp +" equals "+tp3);
        }
    }
}
