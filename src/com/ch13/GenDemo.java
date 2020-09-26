package com.ch13;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> Iob;
        Iob = new Gen<Integer>(88);
        Iob.showType();
        int v =Iob.getOb();
        System.out.println("value : " + v);
        System.out.println();
        Gen<String> strOb = new Gen<String>("Generictest");
        strOb.showType();
        String str =strOb.getOb();
        System.out.println("value : " + str);
    }

}
