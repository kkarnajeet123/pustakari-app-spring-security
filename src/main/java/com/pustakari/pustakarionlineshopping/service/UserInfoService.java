package com.pustakari.pustakarionlineshopping.service;

import com.pustakari.pustakarionlineshopping.model.UserInfo.UserInfo;
import com.pustakari.pustakarionlineshopping.JsonBindingModel.UserInfoJsonBinding;

import java.util.ArrayList;
import java.util.List;


public interface UserInfoService {

    void saveUserInfo(UserInfoJsonBinding userInfoJsonBinding);
    UserInfo updateUserInfo1(UserInfoJsonBinding userInfoJsonBinding);
    void updateUserInfo(UserInfoJsonBinding userInfoJsonBinding);
    void deleteUserInfo(int userId);
    UserInfo showUserInfo(int userId);
    List <UserInfo> showAllUserInfo();
    ArrayList<UserInfo> showAllUserInfo1();
}
