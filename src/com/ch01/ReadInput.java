package com.ch01;

import java.io.IOException;

public class ReadInput {
    public static void main(String[] args) throws IOException {

        char ch ;
        System.out.println("Press a Key followed by Enter :");
        ch = (char) System.in.read();
        System.out.println("your Key is "+ ch);

    }
}
