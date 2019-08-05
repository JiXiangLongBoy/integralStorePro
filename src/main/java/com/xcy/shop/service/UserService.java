package com.xcy.shop.service;

import com.xcy.shop.pojo.LoginResult;
import com.xcy.shop.pojo.User;

public interface UserService {
    int login(User user);
    LoginResult isLogin(User user);

    boolean validateUserName(String userName);

    int insertUser(User user);
}
