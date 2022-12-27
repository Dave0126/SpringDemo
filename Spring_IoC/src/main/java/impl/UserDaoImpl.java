package impl;

import Interface.UserDao;

public class UserDaoImpl implements UserDao {
    private String username;
    private int age;


    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl 创建成功");
    }

    public void init(){
        System.out.println("初始化方法...");
    }

    public void destroy(){
        System.out.println("销毁方法...");
    }

    @Override
    public void save() {
        System.out.println("[UserDao] : "+username+", "+age+"save running...");
    }
}
