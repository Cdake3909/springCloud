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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author chengqi1
 * @date 2020-4-2 18:54
 * 描述：
 */
@Controller
public class RegisterController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    @Autowired
    private LoginService loginService;
    @PostMapping("/register")
    public String register(@ModelAttribute("registerCustinfo") Custinfo registerCustinfo,Model model) {
        log.info(registerCustinfo.toString());
        loginService.insertIntoCustinfo(registerCustinfo);
        model.addAttribute("custinfo",registerCustinfo);
        return "login";
    }

    @RequestMapping("/goToRegister")
    public ModelAndView goToRegister(Model model){
        model.addAttribute("registerCustinfo", new Custinfo());
        return new ModelAndView("register");
    }
}
