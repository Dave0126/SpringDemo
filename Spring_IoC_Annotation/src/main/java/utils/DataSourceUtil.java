package utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@PropertySource("classpath:c3p0.properties")
public class DataSourceUtil {
    @Value("${jdbc.driver}")
    String jdbcDriver;

    @Value("${jdbc.url}")
    String jdbcURL;

    @Value("${jdbc.username}")
    String jdbcUser;

    @Value("${jdbc.password}")
    String jdbcPassword;

    @Bean
    public DataSource getDataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(jdbcDriver);
        dataSource.setJdbcUrl(jdbcURL);
        dataSource.setUser(jdbcUser);
        dataSource.setPassword(jdbcPassword);
        return dataSource;
    }


}
