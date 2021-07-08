/*
package com.pustakari.pustakarionlineshopping.model;

import lombok.Data;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="Cart_Item_Table")
@Data

@Embeddable

public class CartItem {

    @EmbeddedId
    private CartItemKey productcartId;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name="product_Id")
    private Product product;

    @ManyToOne
    @MapsId("cartId")
    @JoinColumn (name="cart_Id")
    private Cart cart;

    @Column(name="sku_number")
    private String sku;
    @Column(name="price")
    private float price;
    @Column(name="discount")
    private float discount;
    @Column(name="quantity")
    private int quantity;
    @Column(name="active")
    private boolean active;
    @Column(name="created_date")
    private Date createdAt;
    @Column(name="updated_date")
    private Date updatedAt;
    @Column(name = "text")
    private String text;


}
*/
