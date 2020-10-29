package com.qf.hong.mvc.controller;

import com.qf.hong.mvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RequestMapping("/user")//将请求的地址映射到对应的方法
@Controller//前后端不分离的时候使用
public class BaseParamsController {

    /*如何接收参数*/

    //1、接收基本类型的参数
    @GetMapping("/test")
    @ResponseBody//返回的数据为json数据
    public String test(int id,String username,String password){
        System.out.println(id);
        System.out.println(username);
        System.out.println(password);
        return username;
    }

    //2、接受普通的对象
    @GetMapping("/test01")
    @ResponseBody
    public User test01(User user){
        user.setId(1);
        user.setUsername("果果");
        user.setPassword("123");
        System.out.println(user.getUsername());
        return user;
    }

    //3、接收复杂的对象
    @GetMapping("/test02")
    @ResponseBody
    public String test02(User user){
        return user.getAddress().getName();
    }

    //4、接收map集合
    @GetMapping("/test03")
    @ResponseBody
    public String test03(Map<String ,String> map){
        System.out.println(map.toString());
        return "map集合被引用";
    }

    //5、接收user中的list集合:该形式要配合@RequstParam注解进行使用
    @GetMapping("/test04")
    @ResponseBody
    public String test04(User user){
        System.out.println(user.getAddressList().toString());
        return "list集合被引用啦";
    }

    //6、接收内置的参数
    @GetMapping("/test05")
    @ResponseBody
    public String test05(HttpServletRequest request,
                         HttpServletResponse response,
                         HttpSession session,
                         Model model,
                         ModelMap modelMap){

        System.out.println(request.toString());
        System.out.println(response.toString());
        return "内置的参数被调用了";

    }
}
