import Interface.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {

    @Test
    public void singletonTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDaoSingleton");
        UserDao userDao2 = (UserDao) context.getBean("userDaoSingleton");
        assert userDao1 == userDao2;
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
    /*
    OUT
        impl.UserDaoImpl@5bb21b69
        impl.UserDaoImpl@5bb21b69
     */

    @Test
    public void prototypeTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDaoPrototype");
        UserDao userDao2 = (UserDao) context.getBean("userDaoPrototype");
        assert userDao1 != userDao2;
        System.out.println(userDao1);
        System.out.println(userDao2);
    }
    /*
    OUT
        impl.UserDaoImpl@5bb21b69
        impl.UserDaoImpl@6b9651f3
     */

    @Test
    public void initAndDestroyTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDaoSingleton");
        System.out.println(userDao1);
        ((ClassPathXmlApplicationContext) context).close();
    }
    /*
    OUT
        UserDaoImpl 创建...
        初始化方法...
        impl.UserDaoImpl@5bb21b69
        销毁方法...
     */

    @Test
    public void constructorTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDaoByConstructor");
        System.out.print(userDao1 + " : ");
        userDao1.save();
        ((ClassPathXmlApplicationContext) context).registerShutdownHook();
    }

    @Test
    public void staticFactoryTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDaoByStaticFactory");
        System.out.println(userDao1);
    }
    /*
    OUT
        UserDaoImpl 创建...
        初始化方法...
        UserDaoImpl 创建...
        impl.UserDaoImpl@12cdcf4
     */

    @Test
    public void userDaoDynamicFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDaoDynamicFactory");
        System.out.println(userDao1);
    }
    /*
    OUT
        UserDaoImpl 创建...
        impl.UserDaoImpl@5bcea91b
     */

    @Test
    public void userDaoBeanFactory() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserDao userDao1 = (UserDao) context.getBean("userDao1");
        userDao1.save();
    }
}
