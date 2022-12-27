package fr.gdai.springmvc.dao;

import fr.gdai.springmvc.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})

public class BookDaoTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void getBookDao() {
        System.out.println(bookDao);
    }


    @Test
    public void getBookPriceByBookId() {
        Integer result = bookDao.getBookPriceByBookId(1);
        System.out.println(result);
    }

    @Test
    public void updateBookStock() {
    }
}