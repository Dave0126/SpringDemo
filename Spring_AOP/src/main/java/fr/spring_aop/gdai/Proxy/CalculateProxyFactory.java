package fr.spring_aop.gdai.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;


public class CalculateProxyFactory {
    // 被代理的对象
    private Object proxyTarget;

    public CalculateProxyFactory(Object proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    public Object getProxyInstance() {
        /**
         * Proxy.newProxyInstance 传入参数:
         *      ClassLoader loader: 类加载器，需要指定动态生成的代理类的类加载器
         *      Class<?>[] interfaces: 获取目标对象实现的所有接口
         *      InvocationHandler h: 设置代理类中的抽象方法如何重写
         */
        return Proxy.newProxyInstance(
                proxyTarget.getClass().getClassLoader(),
                proxyTarget.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /**
                         * Object proxy: 表示被代理的对象
                         * Method method: 要执行的方法
                         * Object[] args: method 方法的参数列表
                         */
                        Object result = null;
                        try {
                            System.out.println("Func_"+method.getName()+" : "+ Arrays.toString(args));
                            result = method.invoke(proxyTarget, args);   // 调用proxyTarget对象的方法
                            System.out.println("Result: "+result);
                        } catch (Exception e){
                            System.out.println("捕获异常: ");
                            e.printStackTrace();
                        } finally {
                            System.out.println("Func_"+method.getName()+" : 运行结束");
                        }

                        return result;
                    }
                });
    }
}
