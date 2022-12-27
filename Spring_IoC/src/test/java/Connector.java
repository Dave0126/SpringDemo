import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Connector {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ComboPooledDataSource dataSource = (ComboPooledDataSource) context.getBean("dataSource1");
        System.out.println(dataSource);
    }
}
