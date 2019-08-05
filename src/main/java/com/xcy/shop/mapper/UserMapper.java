package com.xcy.shop.mapper;

import com.xcy.shop.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {



    int login(User user);
    int isLogin(User user);

    int selectUserName(String userName);

    int insertUser(User user);
}
