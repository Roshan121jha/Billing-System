/*
 * Created by JFormDesigner on Thu Nov 26 19:40:46 IST 2020
 */

package com.initialwebtech.billing.system.desktop.ui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author roshan.jha
 */

@Slf4j
@Component
public class AdminPanel extends JFrame {

    @Autowired
    private AddCategory addCategoryScreen;

    public AdminPanel() {
        initComponents();
    }

    private void closeWindowMouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void LoginActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void addCategoryMouseClicked(MouseEvent e) {
        dispose();
        addCategoryScreen.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        button1 = new JButton();
        error = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        category = new JLabel();
        addCategory = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        panel2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setUndecorated(true);
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("LogOut");
        button1.setBackground(new Color(255, 0, 51));
        button1.setFont(new Font("Century Gothic", Font.BOLD, 18));
        button1.setForeground(Color.white);
        button1.addActionListener(e -> LoginActionPerformed(e));

        //---- error ----
        error.setForeground(Color.red);

        //---- label4 ----
        label4.setText("PRODUCT");
        label4.setBackground(new Color(0, 0, 51));
        label4.setFont(new Font("Century Gothic", Font.BOLD, 16));
        label4.setForeground(new Color(255, 0, 51));

        //---- label5 ----
        label5.setIcon(new ImageIcon(getClass().getResource("/static/images/trolley.png")));

        //---- label6 ----
        label6.setText("CUSTOMER");
        label6.setBackground(new Color(0, 0, 51));
        label6.setFont(new Font("Century Gothic", Font.BOLD, 16));
        label6.setForeground(new Color(255, 0, 51));

        //---- label7 ----
        label7.setIcon(new ImageIcon(getClass().getResource("/static/images/avatar.png")));

        //---- label10 ----
        label10.setText("ORDER");
        label10.setBackground(new Color(0, 0, 51));
        label10.setFont(new Font("Century Gothic", Font.BOLD, 16));
        label10.setForeground(new Color(255, 0, 51));

        //---- label11 ----
        label11.setIcon(new ImageIcon(getClass().getResource("/static/images/trolley.png")));
        label11.setAlignmentY(4.5F);

        //---- category ----
        category.setText("CATEGORY");
        category.setBackground(new Color(0, 0, 51));
        category.setFont(new Font("Century Gothic", Font.BOLD, 16));
        category.setForeground(new Color(255, 0, 51));
        category.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addCategoryMouseClicked(e);
            }
        });

        //---- addCategory ----
        addCategory.setIcon(new ImageIcon(getClass().getResource("/static/images/trolley.png")));
        addCategory.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addCategoryMouseClicked(e);
            }
        });

        //---- label12 ----
        label12.setText("USER");
        label12.setBackground(new Color(0, 0, 51));
        label12.setFont(new Font("Century Gothic", Font.BOLD, 16));
        label12.setForeground(new Color(255, 0, 51));

        //---- label13 ----
        label13.setIcon(new ImageIcon(getClass().getResource("/static/images/avatar.png")));

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 0, 51));
            panel2.setForeground(new Color(255, 0, 51));
            panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing.
            border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER
            , javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font
            .BOLD ,12 ), java. awt. Color. red) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r"
            .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );

            //---- label1 ----
            label1.setText("INVENTORY MANAGEMENT SYSTEM");
            label1.setBackground(new Color(0, 0, 51));
            label1.setFont(new Font("Century Gothic", Font.BOLD, 24));
            label1.setForeground(Color.white);
            label1.setHorizontalTextPosition(SwingConstants.CENTER);
            label1.setHorizontalAlignment(SwingConstants.CENTER);

            //---- label2 ----
            label2.setText("X");
            label2.setFont(new Font("Century Gothic", Font.BOLD, 20));
            label2.setForeground(Color.white);
            label2.setAlignmentX(0.2F);
            label2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    closeWindowMouseClicked(e);
                }
            });

            //---- label3 ----
            label3.setText("MAIN FORM");
            label3.setBackground(new Color(0, 0, 51));
            label3.setFont(new Font("Century Gothic", Font.BOLD, 24));
            label3.setForeground(Color.white);
            label3.setHorizontalTextPosition(SwingConstants.CENTER);
            label3.setHorizontalAlignment(SwingConstants.CENTER);

            GroupLayout panel2Layout = new GroupLayout(panel2);
            panel2.setLayout(panel2Layout);
            panel2Layout.setHorizontalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addContainerGap(121, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(label2)
                        .addGap(19, 19, 19))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label2))
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(label1)))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label3)
                        .addGap(0, 11, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(label4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label6))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(label5)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(label7))
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(label12)
                                                .addComponent(label13))
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label11)
                                                .addComponent(label10, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))))
                                    .addGap(20, 20, 20))))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(error))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGap(369, 369, 369)
                                    .addComponent(addCategory)))
                            .addGap(0, 365, Short.MAX_VALUE)))
                    .addGap(39, 39, 39))
                .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(349, 349, 349)
                            .addComponent(category))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(361, 361, 361)
                            .addComponent(button1)))
                    .addContainerGap(365, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(4, 4, 4)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(label6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label5)
                        .addComponent(label7))
                    .addGap(4, 4, 4)
                    .addComponent(category)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(addCategory)
                    .addGap(12, 12, 12)
                    .addComponent(error)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label10)
                        .addComponent(label12))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label11)
                        .addComponent(label13))
                    .addGap(12, 12, 12)
                    .addComponent(button1)
                    .addGap(24, 24, 24))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JButton button1;
    private JLabel error;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label10;
    private JLabel label11;
    private JLabel category;
    private JLabel addCategory;
    private JLabel label12;
    private JLabel label13;
    private JPanel panel2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
