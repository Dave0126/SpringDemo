package fr.gdai.spring.transaction.dao;

public interface BookDao {
    Integer getBookPriceByBookId(Integer bookId);

    void updateBookStock(Integer bookId);

}
