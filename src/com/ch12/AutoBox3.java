package com.ch12;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb , iOb2;
        int i;
        iOb=99;
        System.out.println("Orginal value of iOb : " + iOb);
        ++iOb;
        System.out.println("After ++iOb :" + iOb);

        iOb+=10;
        System.out.println("After iOb +=10 " + iOb);

        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after experssion : " + iOb2);
        i = iOb + (iOb / 3);
        System.out.println("i after experssion : " + i);

        Double a,b,c;
        a=10.2;
        b=11.4;
        c=9.8;
        Double avg = (a+b+c) /3;
        System.out.println(avg);

    }
}
