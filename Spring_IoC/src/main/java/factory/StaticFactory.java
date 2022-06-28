package factory;

import Interface.UserDao;
import impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
