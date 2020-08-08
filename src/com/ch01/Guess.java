package com.ch01;

public class Guess {
    public static void main(String[] args) {
        try {

            char ch, answer = 'K';
            System.out.println("I'm thinking of a Letter btween a and z . \n Can You Guess it :");
            ch = (char)  System.in.read();

            if (ch == answer) {
                System.out.println("** Right **");

            } else {
                System.out.println("...Sorry, You're Wrong");

                if (ch > answer) {
                    System.out.println("tow Low");
                } else {

                    System.out.println("too high");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
