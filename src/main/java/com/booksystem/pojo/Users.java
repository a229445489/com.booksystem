package com.booksystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description：实体类，对应数据库users表
 * @Author: chen
 * @Date: 2020/7/17-8:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    private Integer userID;

    private String userName;

    private String password;

}
