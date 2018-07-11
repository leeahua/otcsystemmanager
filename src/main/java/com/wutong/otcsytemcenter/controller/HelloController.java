package com.wutong.otcsytemcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public Object hello(HttpServletRequest request, HttpServletResponse response){

        return "hello";
    }
    @RequestMapping("/index")
    public Object index(){
        return "index";
    }
}
