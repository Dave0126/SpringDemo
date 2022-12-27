package fr.gdai.springmvc.dao;

import fr.gdai.springmvc.domain.Book;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    Integer getBookPriceByBookId(@Param("bookId") Integer bookId);

    void updateBookStock(@Param("bookId") Integer bookId);

    List<Book> selectAll();

}
