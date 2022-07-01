package fr.spring_aop.gdai;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateTest {
    @Test
    public void addTest(){
        Calculate cal = new CalculateImpl();
        cal.add(1,2);
    }

    @Test
    public void subAopTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("calculate.xml");
        Calculate cal = applicationContext.getBean(Calculate.class);
        cal.sub(1,2);
    }


}
