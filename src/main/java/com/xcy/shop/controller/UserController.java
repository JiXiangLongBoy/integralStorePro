package com.xcy.shop.controller;

import com.xcy.shop.pojo.LoginResult;
import com.xcy.shop.pojo.User;

import com.xcy.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserService userService;
    //登录页面
    @RequestMapping("/showLogin")
    public String showLogin() {
        return  "login";
    }
    //注册页面
    @RequestMapping("/showregister")
    public String showRegister(){
        return "register";
    }
    //找回密码
    @RequestMapping("/showfindpwd")
    public String showFindpwd(){
        return "find_pwd";
    }
    //登录
    @RequestMapping("/islogin")
    @ResponseBody
    public LoginResult testDemo(User user) {
        System.out.println(user.getUserName()+"!!"+user.getPassWord());
        LoginResult loginResult= userService.isLogin(user);
        return loginResult;
    }
    //验证用户名是否存在
    @RequestMapping("/validateUserName")
    @ResponseBody
    public String validateUserName(String userName){

        boolean isExist = userService.validateUserName(userName);
        //数据库操作
        return isExist?"fail":"success";
    }
    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(User user){
        System.out.println(user);
        int result = userService.insertUser(user);

        return result > 0 ? "success":"fail";
    }
}
