package com.initialwebtech.billing.system.desktop.ui;

import com.initialwebtech.billing.system.desktop.model.Category;
import com.initialwebtech.billing.system.desktop.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Iterator;

@Slf4j
@Component
public class CategoryJTableModel extends DefaultTableModel {

    private final CategoryService categoryService;

    public CategoryJTableModel(CategoryService categoryService){
        this.categoryService = categoryService;
        setColumnIdentifiers(new String[] {"CATID", "CATNAME"});
        getAllCategory();
    }

    public void getAllCategory(){
        final Page<Category> allCategory = categoryService.findAllCategory();
        Iterator<Category> categoryIterator = allCategory.stream().iterator();
        while(categoryIterator.hasNext()) {
            Category element = categoryIterator.next();
            addRow(new Object[]{element.getId(), element.getName()});
        }
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        boolean[] columnEditable = new boolean[] {
                false, true
        };
        return columnEditable[column];
    }
}
