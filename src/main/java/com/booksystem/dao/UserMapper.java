package com.booksystem.dao;

import com.booksystem.pojo.Users;


/**
 * @Description： 后端登录注册接口
 * @Author: chen
 * @Date: 2020/7/17-9:03
 */
public interface UserMapper {

    //用户注册
    int addUser(Users users);

    //用户查重
    int queryUser(Users users);

    //用户登录
    Users loginUser(String userName);

}
