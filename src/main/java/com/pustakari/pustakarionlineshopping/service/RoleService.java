package com.pustakari.pustakarionlineshopping.service;

import com.pustakari.pustakarionlineshopping.JsonBindingModel.RoleJsonBinding;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Role;

import java.util.List;

public interface RoleService {

    void saveRole(RoleJsonBinding roleJsonBinding);
    void updateRole(RoleJsonBinding roleJsonBinding);
    void deleteRole(int roleId);
    Role displayRoleById(int roleId);
    List<Role> displayAllRoles();
   //List<String> dislplayAllRolesName();

}
