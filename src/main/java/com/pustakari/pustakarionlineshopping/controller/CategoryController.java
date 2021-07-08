/*
package com.pustakari.pustakarionlineshopping.controller;

import com.pustakari.pustakarionlineshopping.JsonBindingModel.ProductRegisterJsonBinding;
import com.pustakari.pustakarionlineshopping.model.Category;
import com.pustakari.pustakarionlineshopping.model.Product;
import com.pustakari.pustakarionlineshopping.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    public CategoryController(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    public String saveCategory(ProductRegisterJsonBinding productRegisterJsonBinding, Product product){

        categoryService.saveCategory(productRegisterJsonBinding,product);

        return ("Category Information has been saved!!");

    }

    @GetMapping("/list")
    public List<Category> categoryList(){
       return categoryService.categoryList();
    }


}
*/
