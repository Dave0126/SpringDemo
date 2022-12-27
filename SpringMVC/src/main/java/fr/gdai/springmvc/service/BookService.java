package fr.gdai.springmvc.service;

import fr.gdai.springmvc.domain.Book;

import java.util.List;

public interface BookService {
    void buyBook(Integer userId, Integer bookId);
    List<Book> showAllBooks();
}
