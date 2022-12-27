package factory;

import Interface.UserDao;
import impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDaoInstance(){
        System.out.println("静态工厂返回 UserDao 实例...");
        return new UserDaoImpl();
    }
}
