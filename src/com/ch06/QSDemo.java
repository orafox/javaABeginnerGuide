package com.ch06;

public class QSDemo {
    public static void main(String[] args) {
        char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int i;

        System.out.println("Orginal array : ");
        for (i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
        QuickSort.qsort(a);
        System.out.println("Sorted array : ");

        for (i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

    }


}
