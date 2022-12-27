package impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class BookDaoImplTest {
    @Test
    public void testBookDaoImpl() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDaoImpl bookDao = (BookDaoImpl) context.getBean("bookDao");
        bookDao.print();
    }

}