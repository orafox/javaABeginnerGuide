package com.ch16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class ListDemo implements ListSelectionListener {
    JList<String> jList;
    JLabel jLabel;
    JScrollPane jScrollPane;
    String names[] = {"eman", "Sherry", "Jon", "Rachel", "Sasha", "Josselyn", "Randy", "Tom", "Mary", "ken", "andrew", "matt", "todd"};

    public ListDemo() {
        JFrame jfrm = new JFrame("Jlist demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jList = new JList<>(names);
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane = new JScrollPane(jList);
        jScrollPane.setPreferredSize(new Dimension(120, 90));
        jLabel = new JLabel("please chose a  name");
        jList.addListSelectionListener(this);
        jfrm.add(jScrollPane);
        jfrm.add(jLabel);
       // jfrm.add(jList);
        jfrm.setVisible(true);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int idx = jList.getSelectedIndex();
        if (idx != -1) {
            jLabel.setText("current selection :" + names[idx]);

        } else {
            jLabel.setText("please chose name");

        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }

}
