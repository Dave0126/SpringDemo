package fr.gdai.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"fr.gdai.springmvc.controller", "fr.gdai.springmvc.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
