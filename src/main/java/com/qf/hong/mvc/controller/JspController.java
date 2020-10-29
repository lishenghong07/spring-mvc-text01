package com.qf.hong.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//前后端不分离
public class JspController {

    @GetMapping("/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("username","lili");
        return "";
    }

    @GetMapping("/index01")
    public ModelAndView index01(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","admin");
        modelAndView.setViewName("huahau");
        return modelAndView;
    }
}
