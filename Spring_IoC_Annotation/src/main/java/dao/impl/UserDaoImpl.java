package dao.impl;

import dao.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// <bean id="userDao" class="dao.impl.UserDaoImpl"></bean>
@Component("userDao")
@Scope("singleton")
public class UserDaoImpl implements UserDao {
//    private String username;
//    private int age;
//
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl 创建成功");
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化方法...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法...");
    }

    @Override
    public void save() {
        System.out.println("[UserDao] : "+this+" SAVE RUNNING...");
    }
}
