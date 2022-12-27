package fr.gdai.springmvc.controller;

import fr.gdai.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/tests")
public class TestController {

    @GetMapping("/{id}")
    public Result select(@PathVariable int id){
        System.out.println("test:select id=" + id);
        boolean flag = true;
        return new Result(flag?ResultCode.SELECT_SUCC:ResultCode.SELECT_ERR, flag);
    }

    @PutMapping
    public String update(@RequestBody User user){
        System.out.println("test:update " + user);
        return "{'module':'test_update()'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        System.out.println("test:delete id=" + id);
        return "{'module':'test_delete()'}";
    }

    @PostMapping
    public String insert(@RequestBody User user){
        System.out.println("test:insert " + user);
        return "{'module':'test_insert()'}";
    }
}
