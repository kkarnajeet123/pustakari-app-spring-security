/*
package com.pustakari.pustakarionlineshopping.model.ProductInfo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pustakari.pustakarionlineshopping.model.Product;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Address;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Category_Table")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_Id")
    private int categoryId;
    @Column(name = "categoryName")
    private String categoryName;
    @Column(name="description")
    private String description;
@ManyToMany(mappedBy = "categoryProductList")
    private List<Product> categoryProductList;

   @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<com.pustakari.pustakarionlineshopping.model.Product> productCategory;


    @OneToMany(mappedBy = "categoryId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Product> productList;
}
*/
