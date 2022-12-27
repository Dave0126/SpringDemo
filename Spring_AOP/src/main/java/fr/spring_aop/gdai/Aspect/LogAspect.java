package fr.spring_aop.gdai.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class LogAspect {

    @Pointcut("execution(* fr.spring_aop.gdai.Implements.*.*(..))")
    public void pointCut(){}

    @Before(value = "pointCut()")
    public void before(JoinPoint joinpoint){
        String name = joinpoint.getSignature().getName();
        System.out.println("Func_" + name + " : " + Arrays.toString(joinpoint.getArgs()));
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){
        System.out.println("Result : " + result);
    }

    @After(value = "pointCut()")
    public void after(JoinPoint joinPoint) {
        System.out.println("后置通知");
    }

    @AfterThrowing(value = "pointCut()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        Signature signature = joinPoint.getSignature();
        System.out.println("出现异常，方法名 : "+signature.getName()+"\t异常信息 : "+e);
    }

    @Around("execution(* fr.spring_aop.gdai.Implements.CalculateImpl.multi(..))")
    public Object around(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("@Around_前置通知 : Func_" + joinPoint.getSignature().getName() + Arrays.toString(joinPoint.getArgs()));
            result = joinPoint.proceed();
            System.out.println("@Around_返回通知 : Result = " + result);
        } catch (Throwable e) {
            System.out.println("@Around_异常通知 : " + e);
        } finally {
            System.out.println("@Around_后置通知 : 后置通知");
        }
        return result;
    }

}
