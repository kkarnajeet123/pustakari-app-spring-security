/*
package com.pustakari.pustakarionlineshopping.service;

import com.pustakari.pustakarionlineshopping.model.ProductInfo.Category;
import com.pustakari.pustakarionlineshopping.JsonBindingModel.ProductRegisterJsonBinding;
import com.pustakari.pustakarionlineshopping.model.Product;
import com.pustakari.pustakarionlineshopping.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void saveCategory(ProductRegisterJsonBinding productRegisterJsonBinding, Product product) {
        Category category = categoryRepository.findById(productRegisterJsonBinding.getCategoryId()).orElse(null);

        if (category == null) {
            category = new Category();
            category.setCategoryId(productRegisterJsonBinding.getCategoryId());
            category.setCategoryName(productRegisterJsonBinding.getCategoryTitle());
        }
        List<Product> productList= new ArrayList<>();
        category.setProductList(productList);

        categoryRepository.save(category);

    }



    @Override
    public void deleteCategory(int categoryId) {

        categoryRepository.deleteById(categoryId);

    }

    @Override
    public Category showCategoryById(int categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public List<Category> categoryList() {
        return categoryRepository.findAll();
    }
}
*/
