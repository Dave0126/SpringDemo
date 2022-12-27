package fr.gdai.spring.transaction.service.impl;

import fr.gdai.spring.transaction.configs.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class BookServiceImplTest {
    @Autowired
    private BookServiceImpl bookService;

    @Test
    public void buyBook() {
        bookService.buyBook(1,1);
    }

    /**
     * User.id=99,  User.balance=50;
     * Book.id=1,   Book.price=100;
     */
}