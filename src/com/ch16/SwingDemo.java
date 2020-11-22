package com.ch16;

import javax.swing.*;

public class SwingDemo {
    SwingDemo() {
        JFrame jFrame = new JFrame("A Simple Swing Application");
        jFrame.setSize(275, 100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Gui Programming with swing");
        jFrame.add(jLabel);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}
