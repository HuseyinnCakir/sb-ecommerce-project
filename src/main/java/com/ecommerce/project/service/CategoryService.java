package com.ecommerce.project.service;

import com.ecommerce.project.model.Category;
import com.ecommerce.project.payload.CategoryResponse;

import java.util.List;

public interface CategoryService {
    CategoryResponse getAllCategories();
    void createdCategory(Category category);
    Category updateCategory(Category category,Long categoryId);
    String deleteCategory(Long categoryId);
}
