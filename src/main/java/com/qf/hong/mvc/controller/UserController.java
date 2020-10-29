package com.qf.hong.mvc.controller;

import com.qf.hong.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)//规定请求的方式
    //@RequestMapping(value="/list" method={RequestMethod.GET,RequestMethod.POST})
    public List<User> users(){
        return new ArrayList<>();
    }

    //params:请求的参数必须符合规定的条件
    @ResponseBody
    @RequestMapping(value = "/infor" , method = RequestMethod.POST,params = "id=1")
    public User user(int id){
        return new User();
    }

    //consumes:规定只处理指定的类型
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST,consumes = "application/json")
    public String save(){
        return "指定的类型";
    }

    //products:规定处理的内容
    @RequestMapping(value = "/sava01",method = RequestMethod.POST,produces = "/images/png")
    @ResponseBody
    public String save01(){
        return "";
    }

}
