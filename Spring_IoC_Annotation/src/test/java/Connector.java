import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import utils.SpringConfig;

import javax.sql.DataSource;

public class Connector {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource ds = context.getBean(DataSource.class);
        System.out.println(ds);
    }
}
