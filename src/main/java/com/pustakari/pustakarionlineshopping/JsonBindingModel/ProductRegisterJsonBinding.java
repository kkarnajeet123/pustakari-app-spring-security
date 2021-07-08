package com.pustakari.pustakarionlineshopping.JsonBindingModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductRegisterJsonBinding {

    private int productId;
    private String productName;
    private String description;
    private float price;
    private float discount;
    @DateTimeFormat(pattern = "yyyy-MM-DD")
    @Temporal(TemporalType.DATE)
    private Date createdDate;
    @DateTimeFormat (pattern = "yyyy-MM-DD")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;
    //category
    private int categoryId;
    private String categoryTitle;
    private String categoryDescription;

    //product review
    private int productReviewId;
    private String title;
    private int rating;
    private boolean published;
    @DateTimeFormat(pattern = "yyyy-MM-DD")
    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-DD")
    @Temporal(TemporalType.DATE)
    private Date publishedAt;
    private String text;

}
