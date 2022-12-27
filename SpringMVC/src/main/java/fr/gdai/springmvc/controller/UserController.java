package fr.gdai.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

// 2. 定义controller
// 2.1 使用@Controller注解定义Bean
@Controller
@RequestMapping("/user")
public class UserController {
    // 2.2 设置当前操作的访问路径
    @RequestMapping("/save")
    // 2.3 	设置当前操作的返回值类型, 将该方法的返回值作为响应体返回给浏览器
    @ResponseBody
    public String userSave() {
        System.out.println("user saved!");
        return "{'module':'springmvc:userSave()'}";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete() {
        System.out.println("user deleted!");
        return "{'module':'springmvc:delete()'}";
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(String name, int age) {
        System.out.println("普通参数传递 : addUser ---> name = " + name);
        System.out.println("普通参数传递 : addUser ---> age = " + age);
        return "{'module':'springmvc:addUser()'}";
    }

    @RequestMapping("/addUserDiffParamName")
    @ResponseBody
    public String addUserDiffParamName(@RequestParam("name") String userName,
                                       @RequestParam("age") int userAge) {
        System.out.println("普通参数(不同参数名)传递 : addUser ---> name = " + userName);
        System.out.println("普通参数(不同参数名)传递 : addUser ---> age = " + userAge);
        return "{'module':'springmvc:addUser()'}";
    }

}
