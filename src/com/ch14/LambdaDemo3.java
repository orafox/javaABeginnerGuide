package com.ch14;

public class LambdaDemo3 {
    public static void main(String[] args) {
        StringTest isIn = (a,b)-> a.indexOf(b) !=-1;

        String str = "This is Test";
        System.out.println("testing string :" + str);
        if (isIn.test(str, "is a")) {
            System.out.println("is a found");

        }else {
            System.out.println("is a not found");
        }
        if (isIn.test(str, "xyz")) {
            System.out.println();
        }

    }
}
