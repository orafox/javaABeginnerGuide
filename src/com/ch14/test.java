package com.ch14;

public class test {
    public static void main(String[] args) {
//        System.out.println(() -> 1.0);
//      (n) -> 1.0 /n
// (n) -> (n%2) == 0 //true or false
        MyVal myVal = () -> 98.0;

        System.out.println(myVal.getVale());
        MyParamValue myParamValue = (n) -> 1.0 / n;

        System.out.println("Reciprocal of 4 is" + myParamValue.getValue(4));


    }

    double myMeth() {
        return 98.6;
    }


}
