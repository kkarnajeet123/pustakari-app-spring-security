package com.pustakari.pustakarionlineshopping.service;

import com.pustakari.pustakarionlineshopping.JsonBindingModel.UserInfoJsonBinding;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Address;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Authentication;
import com.pustakari.pustakarionlineshopping.model.UserInfo.Role;
import com.pustakari.pustakarionlineshopping.model.UserInfo.UserInfo;
import com.pustakari.pustakarionlineshopping.repository.AuthenticationRepository;
import com.pustakari.pustakarionlineshopping.repository.RoleRepository;
import com.pustakari.pustakarionlineshopping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private AuthenticationRepository authenticationRepository;


    @Override
    public void saveUserInfo(UserInfoJsonBinding userInfoJsonBinding) {

        UserInfo userInfo = new UserInfo();

        Role role = roleRepository.findById(userInfoJsonBinding.getRole()).orElse(null);

        if (userInfoJsonBinding.getRole() == 1) {
            role.setRoleName("ROLE_ADMIN");
            role.setRoleDescription("Administrative Role");
        } else if (userInfoJsonBinding.getRole() == 2) {
            role.setRoleName("ROLE_MANAGER");
            role.setRoleDescription("Manager Role");
        }else if (userInfoJsonBinding.getRole() == 3) {
            role.setRoleName("ROLE_USER");
            role.setRoleDescription("User Role");
        }


        userInfo.setRole(role);


        Authentication authentication = authenticationRepository.findById(userInfoJsonBinding.getUserId()).orElse(null);

        if (authentication == null) {
            authentication = new Authentication();

        } else {
            authentication = userInfo.getAuthentication();
        }
        authentication.setUsername(userInfoJsonBinding.getUsername());
        authentication.setPassword(userInfoJsonBinding.getPassword());

        userInfo.setAuthentication(authentication);

        // UserInfo userInfo = new UserInfo();
        userInfo.setFirstName(userInfoJsonBinding.getFirstName());
        userInfo.setLastName(userInfoJsonBinding.getLastName());
        userInfo.setDob(userInfoJsonBinding.getDob());
        userInfo.setStatus("Y");
        userInfo.setMiddleName(userInfoJsonBinding.getMiddleName());
        userInfo.setPhoneNumber(userInfoJsonBinding.getPhoneNumber());


        List<Address> addressList = new ArrayList<>();

        userInfo.setUserAddress(addressList);

        userRepository.save(userInfo);
    }
    @Override
    public void updateUserInfo(UserInfoJsonBinding userInfoJsonBinding) {}

    @Override
      public UserInfo updateUserInfo1(UserInfoJsonBinding userInfoJsonBinding){
   // public void updateUserInfo(UserInfoJsonBinding userInfoJsonBinding) {
        UserInfo userInfo = userRepository.findById(userInfoJsonBinding.getUserId()).get();
        
        if(userInfoJsonBinding.getFirstName()!=null){
            userInfo.setFirstName(userInfoJsonBinding.getFirstName());
        }
        if(userInfoJsonBinding.getMiddleName()!=null){
            userInfo.setMiddleName(userInfoJsonBinding.getMiddleName());
        }
        if(userInfoJsonBinding.getLastName()!=null){
            userInfo.setLastName(userInfoJsonBinding.getLastName());
        }
        if(userInfoJsonBinding.getDob()!=null){
            userInfo.setDob(userInfoJsonBinding.getDob());
        }
     //   Integer checkPhoneNumber = userInfoJsonBinding.getPhoneNumber();
        if(userInfoJsonBinding.getPhoneNumber()!=0){
            userInfo.setPhoneNumber(userInfoJsonBinding.getPhoneNumber());
        }
        userInfo.setStatus("Y");

       // Authentication authentication = authenticationRepository.findById(userInfoJsonBinding.getUserId()).get();
     //  if(userInfoJsonBinding.getUsername()!=null && userInfoJsonBinding.getPassword()!=null){
        Authentication authentication = userInfo.getAuthentication();
        if(userInfoJsonBinding.getUsername()!=null ) {
                authentication.setUsername(userInfoJsonBinding.getUsername());
            }
            if(userInfoJsonBinding.getPassword()!=null){
                authentication.setPassword(userInfoJsonBinding.getPassword());
            }
            userInfo.setAuthentication(authentication);
     //   }


        //Role role = roleRepository.findById(userInfoJsonBinding.getRole()).get();
        Role role = userInfo.getRole();
        Integer checkRole = userInfoJsonBinding.getRole();
         if(checkRole!=null){
            if(userInfoJsonBinding.getRole()==1){
                role.setRoleId(1);
                role.setRoleName("ROLE_ADMIN");
                role.setRoleDescription("ADMIN ROLE");
            } if(userInfoJsonBinding.getRole()==2){
                 role.setRoleId(2);
                 role.setRoleName("ROLE_MANAGER");
                 role.setRoleDescription("MANAGER ROLE");

            } if(userInfoJsonBinding.getRole()==3) {
                 role.setRoleId(3);
                 role.setRoleName("ROLE_USER");
                 role.setRoleDescription("USER ROLE");
             }else{

             }
            userInfo.setRole(role);
        }

        userRepository.save(userInfo);

         return userInfo;
    }


    @Override
    public void deleteUserInfo(int userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserInfo showUserInfo(int userId) {

        UserInfo userInfo = userRepository.findById(userId).get();

        return userInfo;
    }

    @Override
    public List<UserInfo> showAllUserInfo() {
        UserInfo userInfo = new UserInfo();
        return userRepository.findAll();

    }

    @Override
    public ArrayList<UserInfo> showAllUserInfo1(){

        List<UserInfo> userInfo1 = userRepository.findAll();
        ArrayList<UserInfo> showAllUserInfo= new ArrayList<UserInfo>();

        return showAllUserInfo;
    }

}
