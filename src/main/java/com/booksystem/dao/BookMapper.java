package com.booksystem.dao;

import com.booksystem.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description： 接口，增删改查
 * @Param
 * 给参数命名,参数命名后就能根据名字得到参数值,正确的将参数传入sql语句中
 * @Author: chen
 * @Date: 2020/7/16-11:32
 */
public interface BookMapper {

    //增加一本书籍
    int addBook(Books books);

    //删除一本书籍,@Param 设置注解
    int deleteBookById(@Param("bookID") Integer id);

    //修改一本书的信息
    int updateBook(Books books);

    //根据id查询一本书，返回书籍信息
    Books queryBookById(@Param("bookID") Integer id);

    //查询全部书籍，返回list集合
    List<Books> queryAllBook();

    //查询书籍
    List<Books> queryBookByName(String bookName);

    //废弃
    int selectNums(String bookName);

}
