package com.ch01;

import java.io.IOException;

public class DwDemo {
    public static void main(String[] args) throws IOException {
        char ch ;
        do {
            System.out.println("press a Key followed by Enter :");
           ch = (char) System.in.read();
        } while (ch !='q');
    }
}
