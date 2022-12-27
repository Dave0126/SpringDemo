package fr.gdai.springmvc.service.impl;

import fr.gdai.springmvc.dao.BookDao;
import fr.gdai.springmvc.dao.UserDao;
import fr.gdai.springmvc.domain.Book;
import fr.gdai.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Autowired
    private UserDao userDao;

    @Override
    public void buyBook(Integer userId, Integer bookId) {
        // 1 查询图书价格
        Integer bookPrice = bookDao.getBookPriceByBookId(bookId);
        // 2 更新图书的库存
        bookDao.updateBookStock(bookId);
        // 3 更新用户余额
        userDao.updateUserBalance(userId, bookPrice);
    }

    @Override
    public List<Book> showAllBooks() {
        return bookDao.selectAll();
    }
}
