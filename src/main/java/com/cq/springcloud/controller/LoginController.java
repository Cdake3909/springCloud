package com.cq.springcloud.controller;

import com.cq.springcloud.model.Custinfo;
import com.cq.springcloud.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView login(Custinfo custinfo, Model model){
        log.info(custinfo.toString());
        int result = loginService.queryCustInfoByMoblieAndPassword(custinfo);
        if(result>0){
            return  new ModelAndView("index");
        }
        model.addAttribute("errorMsg","找不到用户："+custinfo.getMobileNo()+"，请注册");
        return new ModelAndView("login");
    }

}
