package com.booksystem.service;

import com.booksystem.dao.BookMapper;
import com.booksystem.pojo.Books;

import java.util.List;

/**
 * @Description： BookService的实现类,service调用dao层，所以需要组合dao层
 * @Author: chen
 * @Date: 2020/7/16-12:25
 */
public class BoolServiceImpl implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {

        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {

        return bookMapper.addBook(books);
    }

    public int deleteBookById(Integer id) {

        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {

        return bookMapper.updateBook(books);
    }

    public Books queryBookById(Integer id) {

        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {

        return bookMapper.queryAllBook();
    }

    public List<Books> queryBookByName(String bookName) {

        return bookMapper.queryBookByName(bookName);

    }


    public int selectNums(String bookName) {

        return bookMapper.selectNums(bookName);

    }
}
