package fr.gdai.spring.transaction.service.impl;

import fr.gdai.spring.transaction.dao.BookDao;
import fr.gdai.spring.transaction.dao.UserDao;
import fr.gdai.spring.transaction.domain.User;
import fr.gdai.spring.transaction.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(timeout = 3)
    public void buyBook(Integer userId, Integer bookId) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 1 查询图书价格
        Integer bookPrice = bookDao.getBookPriceByBookId(bookId);
        // 2 更新图书的库存
        bookDao.updateBookStock(bookId);
        // 3 更新用户余额
        userDao.updateUserBalance(userId, bookPrice);
    }
}
