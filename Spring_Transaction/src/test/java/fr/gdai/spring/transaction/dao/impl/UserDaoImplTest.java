package fr.gdai.spring.transaction.dao.impl;

import fr.gdai.spring.transaction.configs.SpringConfig;
import fr.gdai.spring.transaction.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class UserDaoImplTest {

    @Autowired
    private UserDaoImpl userDaoImpl;

    @Test
    public void testUpdateUserBalance() {
        userDaoImpl.updateUserBalance(1,30);
    }
}