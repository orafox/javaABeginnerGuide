package com.ch09;

public class ExcDemo5 {
    public static void main(String[] args) {
        int nummer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < nummer.length; i++) {
            try {
                System.out.println(nummer[i] + "/" + denom[i] + " is  " + nummer[i] / denom[i]);

            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("nno Matching element found");
            } catch (Throwable ex) {
                System.out.println("some exception "+ex.getStackTrace());
            }
        }

    }
}
