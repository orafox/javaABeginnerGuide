package com.ch09;

import com.ch13.D;

public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> IOb = new Gen<Integer>(88);
        Gen<String> strObj = new Gen<String>("Generic test");
        Gen raw = new Gen(98.6);
        double d = (Double) raw.getOb();
        System.out.println("value : " + d);
//        System.out.println
//        );
//        int i = (Integer) raw.getOb();
//        strObj = raw;
//        String str =raw.getOb();
        raw= IOb;
//        d=(Double) raw.getOb();
    }
}
