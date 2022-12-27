package fr.spring_aop.gdai.Interfaces;

import org.springframework.stereotype.Component;

public interface Calculate {
    public int add(int num1, int num2);
    public int sub(int num1, int num2);
    public int multi(int num1, int num2);
    public int div(int num1, int num2);
}
