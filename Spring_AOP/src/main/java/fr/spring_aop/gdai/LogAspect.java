package fr.spring_aop.gdai;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {

    @Before("execution(public int CalculateImpl.sub(..))")
    public void before(JoinPoint joinpoint){
        String name = joinpoint.getSignature().getName();
        System.out.println("Func_" + name + " : " + Arrays.toString(joinpoint.getArgs()));
    }

    // 因为切面无法直接获取函数的内部的数据，所以我们需要添加一个映射
    @AfterReturning(value = "execution(public int CalculateImpl.sub(..))", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        System.out.println("Result : " + result);
    }
}
