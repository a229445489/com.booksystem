package com.booksystem.controller;

import com.booksystem.pojo.Books;
import com.booksystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description： 控制层,controller层调用service层
 * @Author: chen
 * @Date: 2020/7/16-13:37
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired//根据类型匹配，需要@Qualifier配合
    @Qualifier("BoolServiceImpl")//声明所需要的的实现类
    private BookService bookService;

    //查询全部书籍，并返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){

        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";

    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){

        return "addBook";

    }

    //添加书籍
    @RequestMapping("/addBook")
    public String addBook(Books books){

        bookService.addBook(books);
        return "redirect:/book/allBook";

    }

    //跳转到书籍修改界面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, Integer id) {

        Books books = bookService.queryBookById(id);
        System.out.println(books);
        model.addAttribute("book",books );
        return "updateBook";

    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){

        System.out.println("updateBook is :" + books);
        bookService.updateBook(books);
        System.out.println("执行完成");
        return "redirect:/book/allBook";

    }

    //删除书籍
    @RequestMapping("/deleteBook")
    public String deleteBook(Integer id){

        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //用书名查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName, Model model){

        int i = bookService.selectNums(queryBookName);
        System.out.println(i);
        List<Books> list = bookService.queryBookByName(queryBookName);
        model.addAttribute("list",list);
        return "queryBook";
       /* Books books = bookService.queryBookByName(queryBookName);
        System.out.println("执行模糊查询");
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if(books == null){
            list = bookService.queryAllBook();
            model.addAttribute("error","未查到书籍信息~~");
            model.addAttribute("list",list);
            return "allBook";
        }
        model.addAttribute("list",list);
        return "allBook";*/

    }


}
