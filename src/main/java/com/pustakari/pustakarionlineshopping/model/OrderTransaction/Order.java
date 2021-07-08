/*
package com.pustakari.pustakarionlineshopping.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Order_Table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_Id")
    private int orderId;
    @Column(name = "session_id")
    private String sessionId;
    @Column(name="token_id")
    private String tokenId;
    @Column(name="status")
    private String status;
    @Column(name="sub_total")
    private float subTotal;
    @Column(name="item_discount")
    private float itemDiscount;
    @Column(name="tax")
    private float tax;
    @Column(name="shipping_cost")
    private float shippingcost;
    @Column(name="total_cost")
    private float total;
    @Column(name="promo_code")
    private String promo;
    @Column(name="discount_amount")
    private float discount;
    @Column(name="grand_total")
    private float grandTotal;
    @Column(name = "first_name")
    private String firstName;
    @Column(name="middle_name")
    private String middleName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="phone_number")
    private int phoneNumber;
    @Column(name="email_address")
    private String email;
    @Column(name="address1")
    private String address1;
    @Column(name="address2")
    private String address2;
    @Column(name="city")
    private String city;
    @Column(name="state")
    private String state;
    @Column(name="zip_code")
    private int zipcode;
    @Column(name="country")
    private String country;
    @Column(name="created_date")
    private Date createdAt;
    @Column(name="updated_date")
    private Date updatedAt;
    @Column(name = "text")
    private String text;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private UserInfo userInfo;


}
*/
