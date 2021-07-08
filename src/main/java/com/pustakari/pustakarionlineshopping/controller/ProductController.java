/*
package com.pustakari.pustakarionlineshopping.controller;

import com.pustakari.pustakarionlineshopping.JsonBindingModel.ProductRegisterJsonBinding;
import com.pustakari.pustakarionlineshopping.model.Product;
import com.pustakari.pustakarionlineshopping.service.CategoryService;
import com.pustakari.pustakarionlineshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itemRegister")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private final ProductService productService;


    @Autowired
    private CategoryService categoryService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @PostMapping("/addItem")
    public String addItems(ProductRegisterJsonBinding productRegisterJsonBinding){
        String msg="product has been added";
        productService.saveProduct(productRegisterJsonBinding);

        return msg;
    }

    @PutMapping("/updateItem")
    public String updateItems(ProductRegisterJsonBinding productRegisterJsonBinding){
        String msg="product has been updated";
        productService.updateProduct(productRegisterJsonBinding);
        return msg;
    }
    @DeleteMapping("/list/{productId}")
    public String deleteItems(int productId){
        String msg="product has been deleted";
        productService.deleteProduct(productId);
        return msg;
    }

    @GetMapping("/list/{productId}")
    public Product showProductById(int productId){

      return  productService.showProductById(productId);
    }
    @GetMapping("/list")
    public List<Product>showAllProducts(){
        return productService.productList();
    }

}
*/
