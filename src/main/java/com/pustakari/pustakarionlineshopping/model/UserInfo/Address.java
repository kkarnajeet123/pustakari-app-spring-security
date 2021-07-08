package com.pustakari.pustakarionlineshopping.model.UserInfo;

import javax.persistence.*;

@Entity
@Table(name="Address_Table")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_Id")
    private int addressId;
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
    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private UserInfo userInfo;

}
