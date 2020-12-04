package com.initialwebtech.billing.system.desktop.service.impl;

import com.initialwebtech.billing.system.desktop.model.Category;
import com.initialwebtech.billing.system.desktop.repository.CategoryRepository;
import com.initialwebtech.billing.system.desktop.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Transactional
    @Override
    public Category addCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public Page<Category> findAllCategory() {
        return this.categoryRepository.findAll(PageRequest.of(0, 100));
    }

}
