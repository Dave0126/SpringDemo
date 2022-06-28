package factory;

import Interface.UserDao;
import impl.UserDaoImpl;

public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
