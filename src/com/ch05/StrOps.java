package com.ch05;

public class StrOps {
    public static void main(String[] args) {
        String str1 = "when it comes to web programmming java is #1";
        String str2 = new String((str1));
        String str3 = "Java Strings are powerful.";
        int result,idx;
        char ch;
        System.out.println("length of str1 : " + str1.length());
        if (str1.equals(str2)) {
            System.out.println("str1 equal str2");

        } else {
            System.out.println("str 2 dosn't equal str2 ");

        }
        if (str1.equals(str3)) {
            System.out.println("str1 equal str3");

        }
        else
            System.out.println("str1 dosn't equal str3");

        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 and str3 are equal");

        } else if (result < 0) {
            System.out.println("str1 less than str3");

        } else if (result > 0) {
            System.out.println("str1 greater than");
        }
        str2 = "One Tow Three One";
        idx = str2.indexOf("One");
        System.out.println("index of first occurerence of one " + idx);
        idx = str2.lastIndexOf("One");
        System.out.println("index of last occurerence of one " + idx);

    }
}
