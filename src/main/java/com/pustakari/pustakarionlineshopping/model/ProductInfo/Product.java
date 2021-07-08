/*
package com.pustakari.pustakarionlineshopping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pustakari.pustakarionlineshopping.model.ProductInfo.Category;
import com.pustakari.pustakarionlineshopping.model.ProductInfo.ProductReview;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Address;
import com.pustakari.pustakarionlineshopping.model.UserInfo.UserInfo;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Product_Table")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_Id")
    private int productId;
    @Column(name="productName")
    private String productName;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private float price;
    @Column(name="discount")
    private float discount;
    @DateTimeFormat (pattern = "yyyy-MM-DD")
    @Temporal(TemporalType.DATE)
    @Column(name="created_date")
    private Date createdDate;
    @DateTimeFormat (pattern = "yyyy-MM-DD")
    @Temporal(TemporalType.DATE)
    @Column(name="updated_date")
    private Date updatedDate;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryId")
    private Category category;

    @OneToMany(mappedBy = "productId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<ProductReview> productReviewList;
   */
/* @ManyToMany
    @JsonIgnore
    @JoinTable(name="ProductCategory_Table",
            joinColumns = @JoinColumn(name="product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categoryProductList;*//*


    */
/*@OneToMany(mappedBy = "product")
    private List<CartItem> cartItemList;*//*






}
*/
