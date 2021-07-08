package com.pustakari.pustakarionlineshopping.model.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name="Role_Table")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_Id")
    private int roleId;
    @Column(name = "roleName")
    private String roleName;
    @Column(name="roleDescription")
    private String roleDescription;

}
