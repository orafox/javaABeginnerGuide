package com.ch10;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;
        try (RandomAccessFile raf = new RandomAccessFile("random.dat", "rw")) {
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("First Value is " + d);
            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Second Value is     " + d);
            raf.seek(8 * 3);
            d = raf.readDouble();
            System.out.print("fourth value is " + d);

            System.out.println();
            for (int i = 0; i < data.length; i++) {
                raf.seek(8 * i);
                d = raf.readDouble();
                System.out.print(d + " ");
            }

//            System.out.print("ss");
//            i love salma very h  xxxxxxxxxx 67
//            System.out.println("thrid value is ");
        } catch (IOException e) {
            System.out.println("i/o Error " + e);
            ;
            ;
        }
    }

}
