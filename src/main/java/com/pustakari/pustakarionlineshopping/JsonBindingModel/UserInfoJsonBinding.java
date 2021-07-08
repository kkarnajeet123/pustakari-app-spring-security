package com.pustakari.pustakarionlineshopping.JsonBindingModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoJsonBinding {
    private int userId;
    private String firstName;
    private String middleName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dob;
   // private String roleName;
    private String username;
    private String password;
    private int role;
    private int phoneNumber;
   // private String rolename;



}
