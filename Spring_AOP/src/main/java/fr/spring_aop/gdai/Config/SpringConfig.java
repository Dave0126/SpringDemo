package fr.spring_aop.gdai.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"fr.spring_aop.gdai"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
