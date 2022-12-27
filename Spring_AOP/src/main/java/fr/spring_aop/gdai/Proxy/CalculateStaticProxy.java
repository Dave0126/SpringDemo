package fr.spring_aop.gdai.Proxy;

import fr.spring_aop.gdai.Interfaces.Calculate;

public class CalculateStaticProxy implements Calculate {
    private Calculate proxyTarget;

    public CalculateStaticProxy(Calculate proxyTarget) {
        this.proxyTarget = proxyTarget;
    }


    @Override
    public int add(int num1, int num2) {
        return proxyTarget.add(num1,num2);
    }

    @Override
    public int sub(int num1, int num2) {
        System.out.println("Func_SUB: "+num1+" - "+num2);
        int result = proxyTarget.sub(num1,num2);
        System.out.println("Result: "+result);
        return result;
    }

    @Override
    public int multi(int num1, int num2) {
        return 0;
    }

    @Override
    public int div(int num1, int num2) {
        return 0;
    }
}
