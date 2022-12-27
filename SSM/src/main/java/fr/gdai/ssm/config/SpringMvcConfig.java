package fr.gdai.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("fr.gdai.ssm.controller")
@EnableWebMvc
public class SpringMvcConfig {
}
