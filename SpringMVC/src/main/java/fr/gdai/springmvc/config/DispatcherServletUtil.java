package fr.gdai.springmvc.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;

//// 定义一个servlet容器启动的配置类，并在其中加载Spring的配置
//public class DispatcherServletUtil extends AbstractDispatcherServletInitializer {
//
//    // 加载Spring容器配置
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext webCtx =
//                new AnnotationConfigWebApplicationContext();
//        webCtx.register(SpringMvcConfig.class);
//        return webCtx;
//    }
//
//    // 设置需要SpringMVC处理的请求
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    // 加载Spring容器配置
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
//}

public class DispatcherServletUtil extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 乱码处理
    @Override
    protected Filter[] getServletFilters() {
        // 使用 SpringMVC 提供的字符过滤器
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        // 设置字符过滤器的编码类型为 utf-8
        filter.setEncoding("utf-8");
        return new Filter[]{filter};
    }
}
