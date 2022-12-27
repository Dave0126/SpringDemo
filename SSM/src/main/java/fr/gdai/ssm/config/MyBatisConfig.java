package fr.gdai.ssm.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MyBatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean =
                new SqlSessionFactoryBean();
        // 设置使用别名的包
        sqlSessionFactoryBean.setTypeAliasesPackage("fr.gdai.springmvc.domain");
        // 为SqlSessionFactory 设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer =
                new MapperScannerConfigurer();
        // 设置自动扫描的包
        mapperScannerConfigurer.setBasePackage("fr.gdai.springmvc.dao");
        return mapperScannerConfigurer;
    }

}
