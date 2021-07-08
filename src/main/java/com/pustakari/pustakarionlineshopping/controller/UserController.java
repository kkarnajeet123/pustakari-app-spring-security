package com.pustakari.pustakarionlineshopping.controller;


import com.pustakari.pustakarionlineshopping.exception.ResourceNotFoundException;
import com.pustakari.pustakarionlineshopping.model.UserInfo.UserInfo;
import com.pustakari.pustakarionlineshopping.JsonBindingModel.UserInfoJsonBinding;

import com.pustakari.pustakarionlineshopping.repository.UserRepository;
import com.pustakari.pustakarionlineshopping.service.UserInfoService;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")

public class UserController {

    @Autowired
    private UserInfoService userInfoService; // make it final
    @Autowired
    private UserRepository userRepository;


    @Autowired
    public UserController(UserInfoService userInfoService){
        this.userInfoService=userInfoService;
    }


    @PostMapping("/register")
    public void saveUserInfo(@RequestBody UserInfoJsonBinding userInfoJsonBinding){

        System.out.println("The username is: "+userInfoJsonBinding.getUsername());
        userInfoService.saveUserInfo(userInfoJsonBinding);
        System.out.println("Save Successful");

    }

/*    @PutMapping("/update")
    public void updateUserInfo(@RequestBody UserInfoJsonBinding userInfoJsonBinding){

        System.out.println(userInfoJsonBinding.getFirstName());
        userInfoService.updateUserInfo(userInfoJsonBinding);
        System.out.println("Update Successful");
    }*/


    
    @PutMapping("update/{userId}")
    public ResponseEntity<UserInfo> updateUserInfo(@PathVariable int userId, @RequestBody UserInfoJsonBinding userInfoJsonBinding){
        System.out.println("The phone number is: "+userInfoJsonBinding.getPhoneNumber());
        UserInfo userInfo= userRepository.findById(userInfoJsonBinding.getUserId()).orElseThrow(()->new ResourceNotFoundException("User not exist with id: "+userId));
        userInfo=userInfoService.updateUserInfo1(userInfoJsonBinding);
       // UserInfo updateUserInfo=userInfoService.updateUserInfo1(userInfoJsonBinding);
        return ResponseEntity.ok(userInfo);
    }


    @DeleteMapping("/list/delete/{userId}")
    public void deleteUserInfo(@PathVariable("userId") int userId){
        UserInfo userInfo= userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not exist with id: "+userId));
        userInfoService.deleteUserInfo(userId);
        System.out.println("UserInfo Deleted for "+userId);
    }


    @GetMapping("/{userId}")
    public UserInfo getUserInfo(@PathVariable int userId){
        UserInfo userInfo= userRepository.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not exist with id: "+userId));
       return userInfoService.showUserInfo(userId);
    }


    @GetMapping("/list")
    public List<UserInfo> getAllUserInfo(){
        return userInfoService.showAllUserInfo();
    }






}
