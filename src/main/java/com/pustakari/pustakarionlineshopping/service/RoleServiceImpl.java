package com.pustakari.pustakarionlineshopping.service;

import com.pustakari.pustakarionlineshopping.JsonBindingModel.RoleJsonBinding;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Role;
import com.pustakari.pustakarionlineshopping.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void saveRole(RoleJsonBinding roleJsonBinding) {
    Role role = new Role();
    role.setRoleName(roleJsonBinding.getRoleName());
    role.setRoleDescription(roleJsonBinding.getRoleDesc());

    roleRepository.save(role);
    }

    @Override
    public void updateRole(RoleJsonBinding roleJsonBinding) {
        Role role = new Role();

        role.setRoleName(roleJsonBinding.getRoleName());
        role.setRoleDescription(roleJsonBinding.getRoleDesc());

        roleRepository.save(role);

    }

    @Override
    public void deleteRole(int roleId) {
    roleRepository.deleteById(roleId);
    }

    @Override
    public Role displayRoleById(int roleId) {

        Role role = roleRepository.findById(roleId).get();

        return role;
    }

    @Override
    public List<Role> displayAllRoles() {
        return roleRepository.findAll();
    }



  /*  @Override
    public List<String> dislplayAllRolesName() {
        List<String> roleName = new ArrayList<>();
         roleRepository.findallroleName().forEach(roleName::add);

        return roleName;
    }*/


}
