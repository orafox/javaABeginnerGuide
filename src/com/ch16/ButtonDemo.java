package com.ch16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo //implements ActionListener
{
    JLabel jLabel;

    ButtonDemo() {
        JFrame jFrame = new JFrame("A Button Example");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(280, 190);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jBtnUp = new JButton("Up1");
        JButton jBtnDown = new JButton("Down1");
        jBtnUp.addActionListener(new jbtnupclass());
        jBtnDown.addActionListener(new jbtndownclass());
//        jBtnUp.addActionListener(this);
//        jBtnDown.addActionListener(this);
        jLabel = new JLabel("press a button");
        jFrame.add(jLabel);
        jFrame.add(jBtnUp);
        jFrame.add(jBtnDown);
        jFrame.setVisible(true);
    }
class jbtnupclass implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        jLabel.setText("you calss pressed up.");
        System.out.println(e.getActionCommand());
    }
}

class jbtndownclass implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        jLabel.setText("you calss pressed down.");
        System.out.println(e.getActionCommand());


    }
}
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getActionCommand().equals("up")) {
//            jLabel.setText("you pressed up.");
//
//        } else {
//            jLabel.setText("you pressed down.");
//        }
//    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
