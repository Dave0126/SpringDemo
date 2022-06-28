package fr.spring_aop.gdai;

import org.springframework.stereotype.Component;

@Component
public class CalculateImpl implements Calculate{
    @Override
    public int add(int num1, int num2) {
        System.out.println("Func_add : " + num1 + " + " + num2);    // 日志打印
        int result = num1 + num2;                                   // 业务代码
        System.out.println("Result : " + result);                   // 日志打印（下同）
        return result;
    }
    // 我们是否能将"日志打印"和"业务代码"分离开呢？ - AOP
    // AOP 要做的就是将日志代码全部抽象出去统一进行处理，计算器方法中只保留核心的业务代码。做到核心业务和非业务代码的解耦合

    @Override
    public int sub(int num1, int num2) {
        //System.out.println("Func_sub : " + num1 + " - " + num2);
        int result = num1 - num2;
        //System.out.println("Result : " + result);
        return result;
    }

    @Override
    public int multi(int num1, int num2) {
        //System.out.println("Func_multi : " + num1 + " * " + num2);
        int result = num1 * num2;
        //System.out.println("Result : " + result);
        return result;
    }

    @Override
    public int div(int num1, int num2) {
        //System.out.println("Func_div : " + num1 + " / " + num2);
        int result = num1 / num2;
        //System.out.println("Result : " + result);
        return result;
    }
}
