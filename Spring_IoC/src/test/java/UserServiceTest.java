import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class UserServiceTest {
    @Test
    public void userServiceTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService) context.getBean("userServiceBySetter");
        userService.save();
    }

    @Test
    public void userServiceByConstructorTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = (UserService) context.getBean("userServiceByConstructor");
        userService.save();
    }
}
