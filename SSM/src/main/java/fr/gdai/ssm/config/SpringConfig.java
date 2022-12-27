package fr.gdai.ssm.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

@Configuration
@Import({DataSourceConfig.class, SpringJdbcConfig.class, MyBatisConfig.class})
// @ComponentScan({"fr.gdai.ssm.dao", "fr.gdai.ssm.service"})
// 可以使用如上分别扫描的方式，也可以采用如下过滤的方式
@ComponentScan(value = "fr.gdai.ssm",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = Controller.class))
public class SpringConfig {
}
