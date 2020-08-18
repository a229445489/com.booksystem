package com.booksystem.service;

import com.booksystem.dao.UserMapper;
import com.booksystem.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description： 登录注册
 * @Author: chen
 * @Date: 2020/7/17-9:42
 */
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }


    public int addUser(Users users) {

        return userMapper.addUser(users);

    }

    public int queryUser(Users users) {

        return userMapper.queryUser(users);

    }

    public boolean checkLogin(String userName, String password) {

      Users users = userMapper.loginUser(userName);

      if(users != null && users.getPassword().equals(password)){

          return true;

      }

      return false;

    }


}
