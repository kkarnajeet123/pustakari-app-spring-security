/*
package com.pustakari.pustakarionlineshopping.model.ProductInfo;

import com.pustakari.pustakarionlineshopping.model.Product;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ProductReview_Table")
@Data
public class ProductReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productReviewId;
    @Column(name="title")
    private String title;
    @Column(name="rating")
    private int rating;
    @Column(name="published")
    private boolean published;
    @DateTimeFormat(pattern = "yyyy-MM-DD")
    @Temporal(TemporalType.DATE)
    @Column(name="created_date")
    private Date createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-DD")
    @Temporal(TemporalType.DATE)
    @Column(name="published_date")
    private Date publishedAt;
    @Column(name="text")
    private String text;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "productId")
    private Product product;

}

*/
