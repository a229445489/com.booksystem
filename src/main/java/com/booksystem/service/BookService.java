package com.booksystem.service;

import com.booksystem.pojo.Books;


import java.util.List;

/**
 * @Description： 服务层
 * @Author: chen
 * @Date: 2020/7/16-12:23
 */
public interface BookService {

    //增加一本书籍
    int addBook(Books books);

    //删除一本书籍,@Param 设置注解
    int deleteBookById(Integer id);

    //修改一本书的信息
    int updateBook(Books books);

    //根据id查询一本书，返回书籍信息
    Books queryBookById(Integer id);

    //查询全部书籍，返回list集合
    List<Books> queryAllBook();

    //用书名查询书籍
    List<Books> queryBookByName(String bookName);

    int selectNums(String bookName);

}
