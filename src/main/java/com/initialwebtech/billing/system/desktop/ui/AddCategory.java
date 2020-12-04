/*
 * Created by JFormDesigner on Fri Nov 27 06:47:54 IST 2020
 */

package com.initialwebtech.billing.system.desktop.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author roshan.jha
 */

@Component
public class AddCategory extends JFrame {

    @Autowired
    private ManageCategory manageCategory;

    public AddCategory() {
        initComponents();
    }

    private void closeWindowMouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void addCategoryMouseClicked(MouseEvent e) {
         dispose();
         manageCategory.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();
        addCategory = new JLabel();
        category = new JLabel();
        category2 = new JLabel();
        addCategory2 = new JLabel();

        //======== this ========
        setUndecorated(true);
        var contentPane = getContentPane();

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 0, 51));
            panel2.setForeground(new Color(255, 0, 51));
            panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax.
            swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn", javax. swing. border
            . TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog"
            ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,panel2. getBorder
            ( )) ); panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java
            .beans .PropertyChangeEvent e) {if ("\u0062ord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException
            ( ); }} );

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
            label3.setText("ADD CATEGORY");
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
                        .addContainerGap(82, Short.MAX_VALUE)
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

        //---- button1 ----
        button1.setText("Back");
        button1.setBackground(new Color(255, 0, 51));
        button1.setFont(new Font("Century Gothic", Font.BOLD, 18));
        button1.setForeground(Color.white);

        //---- addCategory ----
        addCategory.setIcon(new ImageIcon(getClass().getResource("/static/images/trolley.png")));
        addCategory.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addCategoryMouseClicked(e);
            }
        });

        //---- category ----
        category.setText("CATEGORY");
        category.setBackground(new Color(0, 0, 51));
        category.setFont(new Font("Century Gothic", Font.BOLD, 16));
        category.setForeground(new Color(255, 0, 51));

        //---- category2 ----
        category2.setText("SUB CATEGORY");
        category2.setBackground(new Color(0, 0, 51));
        category2.setFont(new Font("Century Gothic", Font.BOLD, 16));
        category2.setForeground(new Color(255, 0, 51));

        //---- addCategory2 ----
        addCategory2.setIcon(new ImageIcon(getClass().getResource("/static/images/trolley.png")));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(359, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(347, 347, 347))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(addCategory)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 590, Short.MAX_VALUE)
                    .addComponent(addCategory2)
                    .addGap(55, 55, 55))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(category)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                    .addComponent(category2)
                    .addGap(24, 24, 24))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(23, 23, 23)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(category)
                        .addComponent(category2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(addCategory)
                        .addComponent(addCategory2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(16, 16, 16))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JLabel addCategory;
    private JLabel category;
    private JLabel category2;
    private JLabel addCategory2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
