/*
package com.pustakari.pustakarionlineshopping.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Cart_Table")
@Data
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cart_Id")
    private int cartId;
    @Column(name = "session_id")
    private String sessionId;
    @Column(name="token_id")
    private String tokenId;
    @Column(name="status")
    private String status;
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

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItemList;

}
*/
