package com.booksystem.controller;

import com.booksystem.pojo.Users;
import com.booksystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description： 用户控制层
 * @Author: chen
 * @Date: 2020/7/17-9:55
 */

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    @Qualifier("UserServiceImpl")
    private UserService userService;

    //跳转到注册页面
    @RequestMapping("/toAddUser")
    public String toAddPaper(){

        return "registUser";

    }
    //注册
    @RequestMapping("/registUser")
    public String registUser(Users users, Model model){

        System.out.println("用户注册："+ users.getUserName() + users.getPassword());
        int i = userService.queryUser(users);
        System.out.println(i);
        if( i > 0){

            model.addAttribute("msg","用户名已存在，请重新注册");
            return "false";

        }else {

            userService.addUser(users);
            model.addAttribute("msg", "注册成功");
            return "success";

        }

    }

    //登录
    @RequestMapping("/loginUser")
    public String loginUser(Users users, Model model){

        boolean loginType  = userService.checkLogin(users.getUserName(), users.getPassword());
        System.out.println("用户登录" + users.getUserName() + users.getPassword());
        System.out.println(loginType);
        if(loginType ){

            /*model.addAttribute("users", users);*/
            System.out.println("完成loginUser操作");
            return "redirect:/book/allBook";

        }else {

            model.addAttribute("msg","用户名密码错误，请重新登录");
            return "loginFalse";

        }


    }




}
