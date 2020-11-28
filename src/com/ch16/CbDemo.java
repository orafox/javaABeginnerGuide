package com.ch16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CbDemo implements ItemListener {
    JLabel jLabelselected, jlabelChange;
    JCheckBox JcbAlpha, JcbBeta, JcbGamma;

    public CbDemo() {
        JFrame jfrm = new JFrame("Demonstrate Check Box");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(600, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jLabelselected = new JLabel("");
        jlabelChange = new JLabel("");
        JcbAlpha = new JCheckBox("Alpha");
        JcbBeta = new JCheckBox("Beta");
        JcbGamma = new JCheckBox("Gamma");
        JcbAlpha.addItemListener(this);
        JcbBeta.addItemListener(this);
        JcbGamma.addItemListener(this);
        jfrm.add(JcbAlpha);
        jfrm.add(JcbBeta);
        jfrm.add(JcbGamma);
        jfrm.add(jLabelselected);
        jfrm.add(jlabelChange);
        jfrm.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = "";
        JCheckBox cb = (JCheckBox) e.getItem();
        if (cb.isSelected()) {
            jlabelChange.setText(cb.getText() + " was jus selected ");
        } else {
            jlabelChange.setText(cb.getText() + " was just cleared");
        }

        if (JcbAlpha.isSelected()) {
            str += "alpha ";
        }
        if (JcbBeta.isSelected()) {
            str += "Beta ";
        }
        if (JcbGamma.isSelected()) {
            str += "Gamma ";
        }
        jLabelselected.setText(str);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CbDemo();
            }
        });
    }
}
