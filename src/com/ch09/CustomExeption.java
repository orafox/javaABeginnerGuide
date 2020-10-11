package com.ch09;

public class CustomExeption {
    public static void main(String[] args) {
        int numer[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};
        for (int i = 0; i < numer.length; i++) {
            try {
                if ((numer[i] % 2) != 0) {
                    throw new NonIntResultExcpetion(numer[i], denom[i]);

                }
                System.out.println(numer[i] + " / " + denom[i]+
                        " is " + numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                System.out.println("can't divde by zero");

            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("no Matching element found");

            } catch (NonIntResultExcpetion excpetion) {
                System.out.println(excpetion);
            }
        }
    }
}
