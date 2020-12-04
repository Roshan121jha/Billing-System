package com.initialwebtech.billing.system;

import com.initialwebtech.billing.system.desktop.model.Category;

import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PaginationExampleMain {

    public static void main(String[] args) {

        JFrame frame = createFrame();
        JTable table = new JTable(createObjectDataModel());
        table.setAutoCreateRowSorter(true);
        table.setRowHeight(30);
        table.setSelectionBackground(new Color(255, 0, 51));
        table.setIntercellSpacing(new Dimension(0, 0));
        table.setFont(new Font("Century Gothic", Font.BOLD, 18));
        //table.setModel(categoryJTableModel);
        //TableRowSorter sorter = new TableRowSorter(categoryJTableModel);
        //table.setRowSorter(sorter);
        //sorter.setRowFilter(filter(10, 1));
        table.setGridColor(UIManager.getColor("Table.gridColor"));
        table.setForeground(new Color(255, 0, 51));
        table.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        table.setBackground(UIManager.getColor("Table.background"));
        table.setFillsViewportHeight(true);
        table.setDoubleBuffered(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        //adding listener and action on table
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                // do some actions here, for example
                // print first column value from selected row
                System.out.println("number of avaiable rows {} "+ table.getSelectedRow());
                String categoryId = table.getValueAt(table.getSelectedRow(), 0).toString();
                String categoryName = table.getValueAt(table.getSelectedRow(), 1).toString();
                //textField1.setText(categoryId);
                //textField2.setText(categoryName);
            }
        });
        JScrollPane scrollPane1 = new JScrollPane();
        scrollPane1.setViewportView(table);
        PaginationDataProvider<Category> dataProvider = createDataProvider();
        PaginatedTableDecorator<Category> paginatedDecorator = PaginatedTableDecorator.decorate(table,
                dataProvider, new int[]{5, 10, 20, 50, 75, 100}, 10);
        frame.add(paginatedDecorator.getContentPanel());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JFrame createFrame() {
        JFrame frame = new JFrame("JTable Pagination example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 300));
        return frame;
    }

    private static TableModel createObjectDataModel() {
        return new ObjectTableModel<Category>() {
            @Override
            public Object getValueAt(Category category, int columnIndex) {
                switch (columnIndex) {
                    case 0:
                        return category.getId();
                    case 1:
                        return category.getName();
                }
                return null;
            }

            @Override
            public int getColumnCount() {
                return 2;
            }

            @Override
            public String getColumnName(int column) {
                switch (column) {
                    case 0:
                        return "Id";
                    case 1:
                        return "Name";
                }
                return null;
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                boolean[] columnEditable = new boolean[] {
                        false, true
                };
                return columnEditable[column];
            }
        };
    }

    private static PaginationDataProvider<Category> createDataProvider() {

        final List<Category> list = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            Category e = new Category();
            e.setId(i);
            e.setName("name" + i);
            list.add(e);
        }

        return new PaginationDataProvider<>() {
            @Override
            public int getTotalRowCount() {
                return list.size();
            }

            @Override
            public List<Category> getRows(int startIndex, int endIndex) {
                return list.subList(startIndex, endIndex);
            }
        };

    }
}
