package com.ch16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("reverse")) {
            String orgStr = jtf.getText();
            String restStr = "";
            for (int i = orgStr.length()-1; i >=0 ; i--) {
                restStr += orgStr.charAt(i);
            }
            jtf.setText(restStr);
            System.out.println(e.getActionCommand());


        }else
        {
            jLabcont.setText("you pressed enter . txt is :" + jtf.getText());
            System.out.println(e.getActionCommand());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }
}
