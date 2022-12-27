package fr.gdai.spring.transaction.dao;

public interface UserDao {
    void updateUserBalance(Integer userId, Integer bookPrice);
}
