package com.booksystem.service;

import com.booksystem.pojo.Users;

/**
 * @Description： 用户登录注册接口
 * @Author: chen
 * @Date: 2020/7/17-9:40
 */
public interface UserService {

    //用户注册
    int addUser(Users users);

    //用户查重
    int queryUser(Users users);

    //用户登录
    boolean checkLogin(String userName, String password);

}
