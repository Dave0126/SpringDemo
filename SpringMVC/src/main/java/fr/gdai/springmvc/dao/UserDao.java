package fr.gdai.springmvc.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    void updateUserBalance(@Param("userId") Integer userId,
                           @Param("price") Integer bookPrice);
}
