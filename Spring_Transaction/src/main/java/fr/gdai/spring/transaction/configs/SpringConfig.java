package fr.gdai.spring.transaction.configs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@Import({DataSourceUtil.class, SpringJDBC.class, TransactionManagerUtil.class})
@ComponentScan("fr.gdai.spring.transaction")
@EnableTransactionManagement
public class SpringConfig {
}
