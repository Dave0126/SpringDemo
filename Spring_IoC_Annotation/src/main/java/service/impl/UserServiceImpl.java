package service.impl;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import service.UserService;

/*
<bean id="userService" class="service.impl.UserServiceImpl">
<property name="userDao" ref="userDao"></property>
</bean>
*/

//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired // 按照数据类型从spring容器中进行匹配。当同一个类型有多个不同名字的bean对象时，需要按照名称匹配(注入)
    @Qualifier("userDao") // 按照名称匹配
    // @Resource(name="userDao") // @Resource = @Autowired + @Qualifier

    private UserDao userDao;

    @Override
    public void save() {
        userDao.save();
    }
}
