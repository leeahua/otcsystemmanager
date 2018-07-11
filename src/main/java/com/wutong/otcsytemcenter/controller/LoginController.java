package com.wutong.otcsytemcenter.controller;


import com.wutong.otcsytemcenter.common.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Positive;

@Controller
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/tologin")
    public Object tologin(HttpServletRequest request, HttpServletResponse response, ModelMap map){
        HttpSession session = request.getSession();
        map.addAttribute("captchaEbabled",true);
        map.addAttribute("captchaType","math");
        return "login";
    }

    @PostMapping("/login")
    public Object login(){
        //TODO 登录验证
        LOG.info("登录成功！");
        return AjaxResult.success();
    }
}
