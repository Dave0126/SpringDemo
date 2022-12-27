package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@ComponentScan({"dao","service"})
@PropertySource("test.properties")
@Import(DataSourceUtil.class)
public class SpringConfig {

}
