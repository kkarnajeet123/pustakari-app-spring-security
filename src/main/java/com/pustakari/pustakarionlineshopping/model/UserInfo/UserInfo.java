package com.pustakari.pustakarionlineshopping.model.UserInfo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="UserInfo_Table")
@Data

public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_Id")
    private int userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name="middle_name")
    private String middleName;
    @Column(name="last_name")
    private String lastName;
    @DateTimeFormat (pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    // or we can use
  //  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "dob")
    private Date dob;
    @Column(name="phone_number")
    private int phoneNumber;
    @Column(name = "active_status")
    private String status;// we need to calculate if the person's last login date is greater than 1 year (if yes, then status is inactive)

    @OneToOne(cascade = CascadeType.MERGE)
    private Role role;

    @OneToOne(cascade = CascadeType.ALL)
    private Authentication authentication;

    @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Address> userAddress; // address is not going to be in the form but later if there is any page to add the customer address then

   /* @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Role> roleList;
*/
    /*@OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Order> orders;*/

   /* @OneToMany(mappedBy = "userInfo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Cart> carts;*/

   /* @JsonIgnoreProperties
    @JsonIgnore
    public List<String>getroleList(){

        if(role.getRoleName().length()>0){
            return Arrays.asList(this.role.getRoleName().split(","));
        }

        return new ArrayList<>();
    };*/
}
