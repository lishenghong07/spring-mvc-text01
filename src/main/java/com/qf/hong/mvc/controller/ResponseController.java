package com.qf.hong.mvc.controller;

import com.qf.hong.mvc.entity.ResponseEntity;
import com.qf.hong.mvc.entity.User;
import com.qf.hong.mvc.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController//前后端分离是使用的控制层修饰注解
@RequestMapping("/user")
public class ResponseController {

    //引入其他容器的对象
    @Resource
    UserService userService;

    //使用@PathVariable和GetMapping进行结合进行动态路径的设置
    @GetMapping("/detail/{id}")
    public ResponseEntity<User> detail(@PathVariable int id){
        ResponseEntity<User> entity = new ResponseEntity<>();
        entity.setData(new User());
        return entity;
    }

    @GetMapping("/list/{page}/{size}")
    public String list(@PathVariable int page,@PathVariable int size){
        System.out.println(page);
        System.out.println(size);
        return "实现了动态路径的设置";
    }

}
