package com.initialwebtech.billing.system.desktop.pagination;

import com.initialwebtech.billing.system.PaginationDataProvider;
import com.initialwebtech.billing.system.desktop.model.Category;
import com.initialwebtech.billing.system.desktop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryPaginationMain implements com.initialwebtech.billing.system.desktop.pagination.PaginationDataProvider {
    
    @Override
    public int getTotalRowCount() {
        return 0;
    }

    @Override
    public List getRows(int startIndex, int endIndex) {
        return null;
    }
}
