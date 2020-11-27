package com.ch16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class TFDemo implements ActionListener {
    JTextField jtf ;
    JButton jbrev;
    JLabel jLabprom, jLabcont;

    public TFDemo() {
        JFrame jfrm = new JFrame("Use a Text Field");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(400, 200);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf = new JTextField(10);
        jtf.setActionCommand("myTF");
        JButton jbtnrev2 = new JButton("reverse");
        jtf.addActionListener(this);
        jbtnrev2.addActionListener(this);
        jLabprom = new JLabel("enter text:");
        jLabcont = new JLabel("");

        jfrm.add(jLabprom);
        jfrm.add(jtf);
        jfrm.add(jLabcont);
        jfrm.add(jbtnrev2);
        jfrm.setVisible(true);

    }
}
