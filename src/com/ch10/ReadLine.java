package com.ch10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("enter Lines of text");
        System.out.println("enter 'stop to quite");
        do {
            str = br.readLine();
            System.out.println(str);

        } while (!str.equals("stop"));
    }
}
