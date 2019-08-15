package com.cq.springcloud.controller;

import com.cq.springcloud.model.Custinfo;
import com.cq.springcloud.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private LoginService loginService;
    @PostMapping("/register")
    public String register(@ModelAttribute Custinfo custinfo) {
        log.info(custinfo.toString());
        loginService.insertIntoCustinfo(custinfo);
        return "login";
    }

    @PostMapping("/login")
    public String login(Custinfo custinfo){
        log.info(custinfo.toString());
        return "index";
    }

}
