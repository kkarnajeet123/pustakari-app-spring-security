package com.pustakari.pustakarionlineshopping.controller;

import com.pustakari.pustakarionlineshopping.JsonBindingModel.RoleJsonBinding;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Role;
import com.pustakari.pustakarionlineshopping.model.UserInfo.UserInfo;
import com.pustakari.pustakarionlineshopping.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/roles")
@CrossOrigin("*")
public class RoleController {

    @Autowired
    private RoleService roleService;

    //@PreAuthorize("hasAnyRole('Role_Admin')")

    @Autowired
    public RoleController(RoleService roleService){
        this.roleService=roleService;
    }

  //  @PreAuthorize("hasAnyRole('ADMIN')")
    @PostMapping("/addRoles")
    public void saveRole(@RequestBody RoleJsonBinding roleJsonBinding){

        System.out.println(roleJsonBinding.getRoleName());
        System.out.println(roleJsonBinding.getRoleDesc());

        UserInfo userInfo = new UserInfo();

        List<String>roles = new ArrayList<>();
        if(userInfo.getRole().getRoleName().length()>0){
            roles=  Arrays.asList(userInfo.getRole().getRoleName().split(","));
        }
        
        roleService.saveRole(roleJsonBinding);
    }

   // @PreAuthorize("hasAnyRole('ADMIN')")
    @PutMapping("/updateRole")
    public void updateRole(@RequestBody RoleJsonBinding roleJsonBinding){

        roleService.updateRole(roleJsonBinding);
    }

  //  @PreAuthorize("hasAnyRole('ADMIN')")
    @DeleteMapping ("/list/{roleId}")
    public void deleteRole(@PathVariable int roleId){

        roleService.deleteRole(roleId);
    }

   // @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
    @GetMapping("/list/{roleId}")

    public Role displayRoleById(@PathVariable int roleId){

        System.out.println("the id role id is: "+roleId);
      return roleService.displayRoleById(roleId);
    }

   // @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
    @GetMapping("/list")
    public List<Role> displayAllRoles(){

       /* UserInfoUserDetailsServiceImpl userDetailsServiceImpl = new UserInfoUserDetailsServiceImpl();

        System.out.println( userDetailsServiceImpl.getAuthorities());*/

        return roleService.displayAllRoles();



    }

}
