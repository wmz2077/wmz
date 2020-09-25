package com.wmz.service;

import com.wmz.pojo.Book;
import org.springframework.stereotype.Component;

import java.util.List;


public interface BookService {

    void saveBook(Book book);

    void updateBook(Book book);

    void deleteBookById(Integer id);

    Book queryBookById(Integer id);

    List<Book> queryBooks();

}
