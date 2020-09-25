package com.wmz.controller;


import com.wmz.pojo.Book;
import com.wmz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class HelloController {

    @Autowired
    BookService bookService;

    @RequestMapping("/hello")
    public String hello(){

        System.out.println("调用控制器");
        bookService.saveBook(new Book(null,"上北大","李哥",new BigDecimal(100),1,1));
        return "/page/ok.jsp";
    }
}
