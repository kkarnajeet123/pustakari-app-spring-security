/*
package com.pustakari.pustakarionlineshopping.service;

import com.pustakari.pustakarionlineshopping.JsonBindingModel.ProductRegisterJsonBinding;
import com.pustakari.pustakarionlineshopping.model.ProductInfo.Category;
import com.pustakari.pustakarionlineshopping.model.Product;
import com.pustakari.pustakarionlineshopping.model.ProductInfo.ProductReview;
import com.pustakari.pustakarionlineshopping.repository.CategoryRepository;
import com.pustakari.pustakarionlineshopping.repository.ProductRepository;
import com.pustakari.pustakarionlineshopping.repository.ProductReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductReviewRepository productReviewRepository;

    @Override
    public void saveProduct(ProductRegisterJsonBinding productRegisterJsonBinding) {


            Product product = productRepository.findById(productRegisterJsonBinding.getProductId()).orElse(null);
            if(product==null) {
                product.setProductId(productRegisterJsonBinding.getProductId());
                product.setProductName(productRegisterJsonBinding.getProductName());
                product.setDescription(productRegisterJsonBinding.getDescription());
                product.setCreatedDate(productRegisterJsonBinding.getCreatedDate());
                product.setUpdatedDate(productRegisterJsonBinding.getUpdatedDate());
                product.setDiscount(productRegisterJsonBinding.getDiscount());
                product.setPrice(productRegisterJsonBinding.getPrice());
            }
                //product reveiw list

 ProductReview productReview = productReviewRepository.findById(productRegisterJsonBinding.getProductReviewId()).orElse(null);
                        if (productReview ==null){
                            productReview.setProductReviewId(productRegisterJsonBinding.getProductReviewId());
                            productReview.setTitle(productRegisterJsonBinding.getTitle());
                            productReview.setRating(productRegisterJsonBinding.getRating());
                            productReview.setPublishedAt(productRegisterJsonBinding.getPublishedAt());
                            productReview.setCreatedAt(productRegisterJsonBinding.getCreatedAt());
                        }

                        List<ProductReview> productReviewList = new ArrayList<>();

                        product.setProductReviewList(productReviewList);
            }




}
*/
