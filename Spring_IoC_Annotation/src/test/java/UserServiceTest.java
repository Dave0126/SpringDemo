import com.mchange.v2.c3p0.ComboPooledDataSource;
import dao.BookDao;
import dao.impl.BookDaoImpl;
import dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.impl.UserServiceImpl;
import utils.SpringConfig;

import java.sql.Connection;

public class UserServiceTest {
    @Test
    public void dataSourceTest() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("root");
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void userServiceXmlTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserServiceImpl.class);
        userService.save();
    }

    @Test
    public void userServiceAnnotationTest(){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean(UserServiceImpl.class);
        userService.save();
    }

    @Test
    public void userDaoAnnotationTest() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserDaoImpl userDao = context.getBean(UserDaoImpl.class);
        userDao.save();
        context.close();
    }

    @Test
    public void bookDaoAnnotationTest() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean(BookDaoImpl.class);
        assert bookDao.toString().equals("[BookDao]: name=gdai");
    }
}
