package fr.gdai.spring.transaction;

import fr.gdai.spring.transaction.configs.SpringConfig;
import fr.gdai.spring.transaction.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

// 指定当前测试类在Spring的测试环境中执行，此时就可以通过注入的方式直接获取IOC容器中的Bean
// 然后导入Spring核心配置
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class JdbcTemplateTest {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert() {
        String sql = "insert into t_user values(?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(sql, 99,"test", "test", 1, "男", "test@test.com", "1000");
    }

    @Test
    public void testSelectById() {
        String sql = "select * from t_user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user.toString());
    }

    @Test
    public void testSelectAll() {
        String sql = "select * from t_user";
        List<User> userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectCount() {
        String sql = "select count(*) from t_user";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }
}
