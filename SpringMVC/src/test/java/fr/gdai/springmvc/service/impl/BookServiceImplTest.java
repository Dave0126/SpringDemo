package fr.gdai.springmvc.service.impl;

import fr.gdai.springmvc.config.SpringConfig;
import fr.gdai.springmvc.dao.BookDao;
import fr.gdai.springmvc.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class BookServiceImplTest {

    @Autowired
    private BookServiceImpl bookService;

    @Test
    public void showAllBooks() {
        List<Book> res = bookService.showAllBooks();
        for(Book i:res) {
            System.out.println(i);
        }
    }
}