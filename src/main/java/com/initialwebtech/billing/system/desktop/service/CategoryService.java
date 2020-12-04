package com.initialwebtech.billing.system.desktop.service;

import com.initialwebtech.billing.system.desktop.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {

    public Category addCategory(Category category);

    public Page<Category> findAllCategory();
}
