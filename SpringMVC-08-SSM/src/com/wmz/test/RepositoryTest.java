package com.wmz.test;

import com.wmz.mapper.BookMapper;
import com.wmz.pojo.Book;
import com.wmz.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.math.BigDecimal;
import java.sql.SQLException;

@ContextConfiguration(locations = {"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class RepositoryTest {

    @Autowired
    DataSource dataSource;

    @Autowired
    BookMapper bookMapper;

    @Autowired
    BookService bookService;

    @Test
    public void test01() throws SQLException {
        System.out.println(dataSource.getConnection());
        System.out.println(bookMapper.selectByPrimaryKey(1));
    }

    @Test
    public void test02(){
//        bookService.saveBook(new Book(null,"33","23",new BigDecimal(11),1,1));
        Book book = bookService.queryBookById(1);
        System.out.println(book);
    }
}
