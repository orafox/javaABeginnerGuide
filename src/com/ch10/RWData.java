package com.ch10;

import java.io.*;

public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d =1023.56;
        boolean b =true;

        try (DataOutputStream dataout = new DataOutputStream(new FileOutputStream("testData"))) {
            System.out.println("Writing " + i);
            dataout.writeInt(i);
            System.out.println("wirting " + d);
            dataout.writeDouble(d);
            System.out.println("wirting " + b);
            dataout.writeBoolean(b);
            System.out.println("writing " + 12.2 * 7.4);
            dataout.writeDouble(12.2 * 7.4);
        } catch (IOException e) {
            System.out.println("write error ");
            return;
        }
        System.out.println();
        try (DataInputStream datain = new DataInputStream(new FileInputStream("testData"))) {

            i = datain.readInt();
            System.out.println("readinog " + i);
            d = datain.readDouble();
            System.out.println("reading " + d);
            b =datain.readBoolean();
            System.out.println("reading " + b);



        } catch (IOException e) {
            System.out.println("read error");
            return;
        }


    }
}
