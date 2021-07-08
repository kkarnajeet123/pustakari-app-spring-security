package com.pustakari.pustakarionlineshopping.JsonBindingModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleJsonBinding {

    private int roleId;
    private String roleName;
    private String roleDesc;
}
