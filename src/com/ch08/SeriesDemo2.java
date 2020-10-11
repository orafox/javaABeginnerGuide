package com.ch08;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos towOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob;
        for (int i = 0; i < 5; i++) {
            ob = towOb;
            System.out.println("next ByTyows is "+ ob.getNext());
        }
        ob = threeOb;
        for (int i = 0; i < 5; i++) {
            System.out.println("next ByThree is "+ ob.getNext());

        }
    }
}
