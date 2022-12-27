package fr.spring_aop.gdai;

import fr.spring_aop.gdai.Implements.CalculateImpl;
import fr.spring_aop.gdai.Interfaces.Calculate;
import fr.spring_aop.gdai.Proxy.CalculateStaticProxy;
import org.junit.Test;

public class CalculateStaticProxyTest {
    private Calculate staticProxyTest = new CalculateStaticProxy(new CalculateImpl());

    @Test
    public void add() {
        staticProxyTest.add(1,2);
    }

    @Test
    public void sub() {
        staticProxyTest.sub(1,2);
    }
}