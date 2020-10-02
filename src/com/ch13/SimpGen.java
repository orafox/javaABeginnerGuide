package com.ch13;

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");
        tgObj.showTypes();
        int v = tgObj.getOb1();
        String str = tgObj.getOb2();
        System.out.println("value : " + v);
        System.out.println("value : " + str);


    }

}
