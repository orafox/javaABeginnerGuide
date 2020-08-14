package com.ch10;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFile {
    public static void main(String[] args) {
        int i = 0, j = 0;
        char d , f;
        if (args.length != 2) {
            System.out.println("Usage: CompFile f1 f2");
            return;


        }

        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
            do {

                i = f1.read();
                j = f2.read();
//                d = (char) i;
//                f = (char) j;


                if (Character.toLowerCase( (char) i) != Character.toLowerCase ((char) j))
                    break;
            } while (i != -1 && j != -1);
            if (i != j) {
                System.out.println("File differ");

            } else
                System.out.println("Files are the same");
        } catch (IOException e) {
            System.out.println("I/o Error:"+e);

        }

    }
}
