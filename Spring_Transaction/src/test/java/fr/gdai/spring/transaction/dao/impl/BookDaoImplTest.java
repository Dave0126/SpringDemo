package fr.gdai.spring.transaction.dao.impl;

import fr.gdai.spring.transaction.configs.SpringConfig;
import fr.gdai.spring.transaction.dao.BookDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})

public class BookDaoImplTest {

    @Autowired
    private BookDaoImpl bookDaoImpl;

    @Test
    public void getBookPriceByBookId() {
        Integer result = bookDaoImpl.getBookPriceByBookId(1);
        System.out.println(result);
    }

    @Test
    public void updateBookStock() {
    }
}