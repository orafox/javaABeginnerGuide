package com.ch10;

public class FileHelp {
    public static void main(String[] args) {
        Help helpobj = new Help("help.txt");
        String topic;
        System.out.println("try the helpe system. " + "enter stop to end.");
        do {
            topic = helpobj.getSelection();
            if (!helpobj.helpOn(topic)) {
                System.out.println("topic not found. \n");

            }
        } while (topic.compareTo("stop") != 0);

    }
}
