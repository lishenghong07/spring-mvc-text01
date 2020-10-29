package com.qf.hong.mvc.controller;

import com.qf.hong.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RequestParamController {
    //由于在大的项目中，有大量的语言来创建后台，所以在命名的时候有所不同，
    //引入@RequestParam给不同的属性名进行设置别名
    /*
    * @RequestParam有三个属性
    *   value:当客户端的参数和方法的参数不一样的时候使用
    *   required：表示必须要的参数，并且默认为true
    *   defaultValue:给参数赋初始值
    *
    * */


    @GetMapping("/test01")//get的请求中没有请求体
    @ResponseBody
    public String test01(@RequestParam(value = "user_name") String username){
        System.out.println(username);
        return username;
    }


    @PostMapping("/test02")//post的请求有请求体
    @ResponseBody
    public String test02(@RequestParam(value = "user_name",required = false) String name,
                        @RequestParam(required = false,defaultValue = "1") int page,
                         @RequestParam(required = false,defaultValue = "10") int size){
        System.out.println(name);
        System.out.println(page);
        System.out.println(size);
        return "";
    }

    /*传参是尽量的使用对象
    * */
    @ResponseBody
    @GetMapping
    public String test03(@RequestBody User user){
        return "自动解析json数据";
    }


}
