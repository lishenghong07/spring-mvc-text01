package com.qf.hong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestHeaderController {

    @GetMapping("/text1")
    @ResponseBody
    public String test1(@RequestHeader String header){
        System.out.println(header);
        return "请求头传递参数";
    }

    @ResponseBody
    @GetMapping("/test2")
    public String test2(@CookieValue("UM_DISTINCTID") String num){
        System.out.println(num);
        return "请求头传递参数";
    }
}
