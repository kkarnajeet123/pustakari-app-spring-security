package com.pustakari.pustakarionlineshopping.model.UserInfo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="Authentication_Table")
@Data
public class Authentication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auth_Id")
    private int authId;
    @Column(name="username")
    private String username;
    @Column(name = "password")
    private String password;

}
