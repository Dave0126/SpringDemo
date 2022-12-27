package fr.spring_aop.gdai;

import fr.spring_aop.gdai.Implements.CalculateImpl;
import fr.spring_aop.gdai.Interfaces.Calculate;
import fr.spring_aop.gdai.Proxy.CalculateProxyFactory;
import org.junit.Test;

public class CalculateProxyFactoryTest {

    private CalculateProxyFactory factory = new CalculateProxyFactory(new CalculateImpl());

    @Test
    public void sub() {
        Calculate proxy = (Calculate) factory.getProxyInstance();
        proxy.sub(1,2);
    }

    @Test
    public void div() {
        Calculate proxy = (Calculate) factory.getProxyInstance();
        proxy.div(1,0);
    }

}