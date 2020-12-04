/*
 * Created by JFormDesigner on Thu Nov 26 14:20:24 IST 2020
 */

package com.initialwebtech.billing.system.desktop.ui;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class Splash extends JFrame {
    public Splash() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ResourceBundle bundle = ResourceBundle.getBundle("application");
        label1 = new JLabel();
        label2 = new JLabel();
        InvSys = new JLabel();
        label3 = new JLabel();
        progressBar1 = new JProgressBar();

        //======== this ========
        setUndecorated(true);
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText(bundle.getString("splash_new.label1.text"));
        label1.setFont(new Font("Century Gothic", Font.BOLD, 30));
        label1.setForeground(new Color(255, 0, 51));

        //---- label2 ----
        label2.setIcon(new ImageIcon(getClass().getResource("/static/images/database-import.png")));

        //---- InvSys ----
        InvSys.setText("Invsys");
        InvSys.setFont(new Font("Century Gothic", Font.BOLD, 30));
        InvSys.setForeground(new Color(255, 0, 51));

        //---- label3 ----
        label3.setText("%");
        label3.setForeground(new Color(251, 0, 51));
        label3.setFont(new Font("Century Gothic", Font.BOLD, 30));

        progressBar1.setBackground(new java.awt.Color(255, 255, 255));
        progressBar1.setForeground(new java.awt.Color(255, 0, 51));
        progressBar1.setBorderPainted(false);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(label2)
                            .addGap(18, 18, 18)
                            .addComponent(InvSys))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(253, 253, 253)
                            .addComponent(label3)))
                    .addContainerGap(40, Short.MAX_VALUE))
                .addComponent(progressBar1, GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(label1)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(label2))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(InvSys)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(197, Short.MAX_VALUE)
                            .addComponent(label3)
                            .addGap(29, 29, 29)))
                    .addComponent(progressBar1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JLabel label1;
    private JLabel label2;
    private JLabel InvSys;
    public JLabel label3;
    public JProgressBar progressBar1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
