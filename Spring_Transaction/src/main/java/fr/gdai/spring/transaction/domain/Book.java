package fr.gdai.spring.transaction.domain;

public class Book {
    private Integer bookId;
    private String bookName;
    private Integer price;
    private Integer stock;

    public Book() {
    }

    public Book(Integer bookId, String bookName, Integer price, Integer stock) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.stock = stock;
    }

    public Integer getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
