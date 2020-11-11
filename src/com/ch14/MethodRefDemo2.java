package com.ch14;

public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;
        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);
        IntPredicate ip = myNum::isFactor;
        result = ip.test(3);
        if(result) System.out.println("3 is factor of " + myNum.getNum());

        ip=myNum2::isFactor;
        result=ip.test(3);
        if(!result)
            System.out.println("3 is not a factor of "+myNum2.getNum());
    }
}
