package com.initialwebtech.billing.system.desktop.ui;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Slf4j
@Component
public class addProduct extends JPanel implements ActionListener {

    private JTextField idField;
    private JTextField quanField;
    private JTextArea descField;
    private JComboBox<String> company;


    public addProduct(){
        initializeAddProduct();
    }

    private void initializeAddProduct() {
        setLayout(null);
        setBounds(100, 100, 840, 619);
        add(addProductLabel());
        add(productIdLabel());
        add(productDetails());
        add(getIdField());

        descField = new JTextArea();
        descField.setBounds(449, 168, 136, 58);
        add(descField);
        JScrollPane scroll = new JScrollPane(descField);
        scroll.setBounds(449, 168, 136, 58);
        add(scroll);

        add(company());
        add(addProductButton());
        add(getQuanField());
        add(lblQuantity());
        add(companyJomboBox());
        add(errorLabel());
    }

    private JLabel addProductLabel(){
        JLabel lblAddProduct = new JLabel("ADD PRODUCT");
        lblAddProduct.setBounds(328, 45, 115, 21);
        lblAddProduct.setFont(new Font("Tahoma", Font.PLAIN, 17));
        return lblAddProduct;
    }

    private JLabel productIdLabel(){
        JLabel lblProductName = new JLabel("Product ID");
        lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblProductName.setBounds(246, 136, 124, 21);
        return lblProductName;
    }

    private JLabel productDetails(){
        JLabel lblProductDescription = new JLabel("Product Details\r\n");
        lblProductDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblProductDescription.setBounds(246, 168, 139, 21);
        return lblProductDescription;
    }

    private JLabel lblQuantity(){
        JLabel lblQuantity = new JLabel("Items available");
        lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblQuantity.setBounds(246, 273, 124, 21);
        return lblQuantity;
    }

    private JLabel company(){
        JLabel lblCompany = new JLabel("Company");
        lblCompany.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblCompany.setBounds(246, 241, 124, 21);
        return lblCompany;
    }

    private JButton addProductButton(){
        JButton btnAddProduct = new JButton("Add Product");
        btnAddProduct.setBounds(449, 334, 136, 23);
        btnAddProduct.addActionListener(this::actionPerformed);
        return btnAddProduct;
    }

    private JTextField getIdField(){
        idField = new JTextField();
        idField.setBounds(449, 137, 136, 20);
        idField.setColumns(10);
        return idField;
    }

    private JTextField getQuanField(){
        quanField = new JTextField();
        quanField.setBounds(449, 274, 136, 20);
        quanField.setColumns(10);
        return quanField;
    }

    private JComboBox<String> companyJomboBox(){
        company = new JComboBox<>();
        company.setBounds(449, 243, 136, 20);
        company.addItem("General");
        company.addItem("Mats & Rugs");
        company.addItem("N/S & Electric");
        return company;
    }

    private JLabel errorLabel(){
        JLabel error = new JLabel("");
        error.setForeground(Color.RED);
        error.setBounds(339, 92, 265, 14);
        return error;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        log.info("@@@@ clicked Add Product Button "+idField.getText());
        log.info("@@@@ clicked Add Product Button "+quanField.getText());
        log.info("@@@@ clicked Add Product Button "+descField.getText());
        log.info("@@@@ clicked Add Product Button "+company.getSelectedItem());
    }
}
