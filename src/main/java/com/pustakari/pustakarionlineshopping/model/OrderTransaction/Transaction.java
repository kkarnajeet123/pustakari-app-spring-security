/*
package com.pustakari.pustakarionlineshopping.model;

import lombok.Data;
import org.apache.catalina.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Transaction_Table")
@Data
public class Transaction {

    @EmbeddedId
    private TransactionKey transactionId;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name="user_Id")
    private UserInfo userInfo;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_Id")
    private Order order;

    @Column (name="payment_code_Id")
    private String paymentCode;//payment id provided by the payment gateway
    @Column(name="payment_type")
    private String paymentType;//Credit or Debit
    @Column(name="payment_mode")
    private String paymentMode;//Method of payment like offline, cash on delivery, cheque,draft, and online
    @Column(name="status")
    private String status; //pending, success, new, cancelled,failed,declined, rejected

    @Column(name="created_date")
    private Date createdAt;
    @Column(name="updated_date")
    private Date updatedAt;
    @Column(name = "text")
    private String text;


}
*/
