package fr.spring_aop.gdai;

import fr.spring_aop.gdai.Config.SpringConfig;
import fr.spring_aop.gdai.Implements.CalculateImpl;
import fr.spring_aop.gdai.Interfaces.Calculate;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculateSpringAopTest {
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

    @Test
    public void testAdd() {
        Calculate calculate = context.getBean(Calculate.class);
        calculate.add(1,2);
    }

    @Test
    public void testSub() {
        Calculate calculate = context.getBean(Calculate.class);
        calculate.sub(1,2);
    }

    @Test
    public void testMulti() {
        Calculate calculate = context.getBean(Calculate.class);
        calculate.multi(1,2);
    }

    @Test
    public void testDiv() {
        Calculate calculate = context.getBean(Calculate.class);
        calculate.div(2,1);
    }

    @Test
    public void testDivWithException() {
        Calculate calculate = context.getBean(Calculate.class);
        calculate.div(2,0);
    }

    @Test
    public void testMultiAround() {
        Calculate calculate = context.getBean(Calculate.class);
        calculate.multi(2,0);
    }
}
