package fr.gdai.spring.transaction.dao.impl;

import fr.gdai.spring.transaction.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    /**
     * 更新用户余额
     * @param userId
     * @param bookPrice
     */
    @Override
    public void updateUserBalance(Integer userId, Integer bookPrice) {
        String sql = "update t_user set balance = balance - ? where id = ?";
        jdbcTemplate.update(sql, bookPrice, userId);
    }
}
