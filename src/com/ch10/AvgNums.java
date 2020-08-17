package com.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;
        System.out.println("how Many numbers will enter:");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);

        } catch (NumberFormatException exe) {
            System.out.println("Invalid format");
            n = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("enter : "+n +" values.");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);

            } catch (NumberFormatException exe) {
                System.out.println("invalid format");
                t = 0.0;
            }
            sum += t;
        }
        System.out.println("sum = " + sum);
        avg = sum / n;
        System.out.println("average is " + avg);


    }
}
