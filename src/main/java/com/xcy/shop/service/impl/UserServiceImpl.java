package com.xcy.shop.service.impl;

import com.xcy.shop.mapper.UserMapper;
import com.xcy.shop.pojo.LoginResult;
import com.xcy.shop.pojo.User;
import com.xcy.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;



    @Override
    public int login(User user) {
        return userMapper.login(user);
    }

    @Override
    public LoginResult isLogin(User user) {
        int count = userMapper.login(user);

        if (count == 1) {
            int id = userMapper.isLogin(user);
            return new LoginResult(1,id,"用户名验证登录成功");
        } else {
            return new LoginResult(0,0,"用户名或密码错误，登陆失败");
        }
    }

    @Override
    public boolean validateUserName(String userName) {

        int count = userMapper.selectUserName(userName);
        return count > 0 ? true :false ;
    }

    @Override
    public int insertUser(User user) {

        return userMapper.insertUser(user);
    }

}
