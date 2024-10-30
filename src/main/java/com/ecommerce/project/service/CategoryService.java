package com.ecommerce.project.service;


import com.ecommerce.project.payload.CategoryDTO;
import com.ecommerce.project.payload.CategoryResponse;


public interface CategoryService {
    CategoryResponse getAllCategories(Integer pageNumber, Integer pageSize, String sortBy,String sortOrder);
    CategoryDTO createCategory(CategoryDTO category);
    CategoryDTO updateCategory(CategoryDTO categoryDTO,Long categoryId);
    CategoryDTO deleteCategory(Long categoryId);
}
