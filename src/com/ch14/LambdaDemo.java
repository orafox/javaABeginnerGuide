package com.ch14;

public class LambdaDemo {
    public static void main(String[] args) {
        MyVal myVal;
        myVal = () -> 98.0;

        System.out.println("A constant value :" + myVal.getVale());


//        MyParamValue myParamValue = new MyParamValue() {
//            @Override
//            public double getValue(double v) {
//                return 0;
//            }
//        }

        MyParamValue myParamValue = (n) -> 1 / n;
        System.out.println("Reciprocal of 4 is :" + myParamValue.getValue(4));
        System.out.println("Reciprocal of 8 is :" + myParamValue.getValue(8));
    }
}
