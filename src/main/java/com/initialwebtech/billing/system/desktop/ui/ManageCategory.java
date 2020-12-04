/*
 * Created by JFormDesigner on Fri Nov 27 08:54:58 IST 2020
 */

package com.initialwebtech.billing.system.desktop.ui;

import com.initialwebtech.billing.system.desktop.model.Category;
import com.initialwebtech.billing.system.desktop.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.*;

/**
 * @author roshan.jha
 */

@Slf4j
@Component
public class ManageCategory extends JFrame{

    private final CategoryService categoryService;

    private final CategoryJTableModel categoryJTableModel;

    public ManageCategory(CategoryService categoryService, CategoryJTableModel categoryJTableModel) {
        this.categoryService = categoryService;
        this.categoryJTableModel = categoryJTableModel;
        initComponents();
    }

    private void closeWindowMouseClicked(MouseEvent e) {
        // TODO add your code here
        System.exit(0);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel2 = new JPanel();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        panel1 = new JPanel();
        label4 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label5 = new JLabel();
        label6 = new JLabel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        panel3 = new JPanel();
        comboBox1 = new JComboBox<>();
        label7 = new JLabel();
        textField3 = new JTextField();
        panel4 = new JPanel();
        int[] pageSizes = new int[]{5, 10, 20, 50, 75, 100};
        int defaultPageSize = 10;

        //======== this ========
        var contentPane = getContentPane();

        //======== panel2 ========
        {
            panel2.setBackground(new Color(255, 0, 51));
            panel2.setForeground(new Color(255, 0, 51));
            panel2.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
            0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
            .BOTTOM,new java.awt.Font("D\u0069alog",java.awt.Font.BOLD,12),java.awt.Color.
            red),panel2. getBorder()));panel2. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
            beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException();}});

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
            label3.setText("MANAGE CATEGORIES");
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
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel2Layout.createParallelGroup()
                            .addComponent(label1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 618, GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(label2)
                        .addGap(17, 17, 17))
            );
            panel2Layout.setVerticalGroup(
                panel2Layout.createParallelGroup()
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup()
                            .addGroup(panel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1))
                            .addComponent(label2))
                        .addGap(18, 18, 18)
                        .addComponent(label3))
            );
        }

        //======== panel1 ========
        {
            panel1.setForeground(new Color(255, 0, 51));
            panel1.setFont(new Font("Century Gothic", Font.BOLD, 18));
            panel1.setBorder(null);
            panel1.setBackground(UIManager.getColor("Table.background"));
            panel1.setAutoscrolls(true);

            //---- label4 ----
            label4.setText("Category Id");
            label4.setFont(new Font("Century Gothic", Font.BOLD, 18));
            label4.setForeground(new Color(255, 0, 51));

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setRowHeight(30);
                table1.setSelectionBackground(new Color(255, 0, 51));
                table1.setIntercellSpacing(new Dimension(0, 0));
                table1.setFont(new Font("Century Gothic", Font.BOLD, 18));
                table1.setModel(categoryJTableModel);
                table1.setGridColor(UIManager.getColor("Table.gridColor"));
                table1.setForeground(new Color(255, 0, 51));
                table1.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
                table1.setBackground(UIManager.getColor("Table.background"));
                table1.setFillsViewportHeight(true);
                table1.setDoubleBuffered(true);
                table1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                table1.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                    public void valueChanged(ListSelectionEvent event) {
                        System.out.println("number of avaiable rows {} "+ table1.getSelectedRow());
                        String categoryId = table1.getValueAt(table1.getSelectedRow(), 0).toString();
                        String categoryName = table1.getValueAt(table1.getSelectedRow(), 1).toString();
                        textField1.setText(categoryId);
                        textField2.setText(categoryName);
                    }
                });
                scrollPane1.setViewportView(table1);
            }

            //---- label5 ----
            label5.setText("CATEGORIES LIST");
            label5.setBackground(new Color(255, 0, 51));
            label5.setFont(new Font("Century Gothic", Font.BOLD, 24));
            label5.setForeground(new Color(255, 0, 51));

            //---- label6 ----
            label6.setText("Category Name");
            label6.setFont(new Font("Century Gothic", Font.BOLD, 18));
            label6.setForeground(new Color(255, 0, 51));

            //---- button1 ----
            button1.setText("Add");
            button1.setForeground(Color.white);
            button1.setFont(new Font("Century Gothic", Font.BOLD, 18));
            button1.setBackground(new Color(255, 0, 51));

            //---- button2 ----
            button2.setText("Edit");
            button2.setForeground(Color.white);
            button2.setFont(new Font("Century Gothic", Font.BOLD, 18));
            button2.setBackground(new Color(255, 0, 51));

            //---- button3 ----
            button3.setText("Delete");
            button3.setForeground(Color.white);
            button3.setFont(new Font("Century Gothic", Font.BOLD, 18));
            button3.setBackground(new Color(255, 0, 51));

            //---- button4 ----
            button4.setText("Home");
            button4.setForeground(Color.white);
            button4.setFont(new Font("Century Gothic", Font.BOLD, 18));
            button4.setBackground(new Color(255, 0, 51));
            button4.setName("Add");

            if (pageSizes != null) {
                comboBox1 = new JComboBox<>(
                        Arrays.stream(pageSizes).boxed()
                                .toArray(Integer[]::new));
                comboBox1.addActionListener((ActionEvent e) -> {
                    //to preserve current rows position
                    currentPageSize = defaultPageSize;
                    int currentPageStartRow = ((currentPage - 1) * currentPageSize) + 1;
                    currentPageSize = (Integer) comboBox1.getSelectedItem();
                    currentPage = ((currentPageStartRow - 1) / currentPageSize) + 1;
                    //paginate();
                });
                comboBox1.setSelectedItem(currentPageSize);
            }

            //======== panel3 ========
            {

                //---- label7 ----
                label7.setText("Page Size");

                //======== panel4 ========
                {

                    GroupLayout panel4Layout = new GroupLayout(panel4);
                    panel4.setLayout(panel4Layout);
                    panel4Layout.setHorizontalGroup(
                        panel4Layout.createParallelGroup()
                            .addGap(0, 148, Short.MAX_VALUE)
                    );
                    panel4Layout.setVerticalGroup(
                        panel4Layout.createParallelGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                    );
                }

                GroupLayout panel3Layout = new GroupLayout(panel3);
                panel3.setLayout(panel3Layout);
                panel3Layout.setHorizontalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textField3, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label7)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                            .addGap(17, 17, 17))
                );
                panel3Layout.setVerticalGroup(
                    panel3Layout.createParallelGroup()
                        .addGroup(panel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label7)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField3)
                                .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(10, 10, 10))
                );
            }

            GroupLayout panel1Layout = new GroupLayout(panel1);
            panel1.setLayout(panel1Layout);
            panel1Layout.setHorizontalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup()
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(label4)
                                    .addComponent(label6))
                                .addGap(24, 24, 24)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
                            .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(button1, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup()
                                    .addComponent(button4, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(button2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(button3)
                                .addGap(21, 21, 21)))
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 422, GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label5)
                        .addGap(129, 129, 129))
            );
            panel1Layout.setVerticalGroup(
                panel1Layout.createParallelGroup()
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label5)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label4)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label6)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(button1)
                            .addComponent(button2)
                            .addComponent(button3))
                        .addGap(18, 18, 18)
                        .addComponent(button4)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(panel2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(panel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void paginate() {
        int startIndex = (currentPage - 1) * currentPageSize;
        int endIndex = startIndex + currentPageSize;
       /* if (endIndex > dataProvider.getTotalRowCount()) {
            endIndex = dataProvider.getTotalRowCount();
        }
        List<T> rows = dataProvider.getRows(startIndex, endIndex);
        objectTableModel.setObjectRows(rows);
        objectTableModel.fireTableDataChanged();*/
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPanel panel1;
    private JLabel label4;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label5;
    private JLabel label6;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel panel3;
    private JComboBox<Integer> comboBox1;
    private JLabel label7;
    private JTextField textField3;
    private JPanel panel4;
    private int currentPage = 1;
    private int currentPageSize;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
