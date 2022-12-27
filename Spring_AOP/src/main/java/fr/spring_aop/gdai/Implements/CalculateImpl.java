package fr.spring_aop.gdai.Implements;

import fr.spring_aop.gdai.Interfaces.Calculate;
import org.springframework.stereotype.Component;

@Component
public class CalculateImpl implements Calculate {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multi(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int div(int num1, int num2) {
        int result = 0;
        try {
            result = num1 / num2;
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.print("Finally : ");
        }
        return result;
    }
}