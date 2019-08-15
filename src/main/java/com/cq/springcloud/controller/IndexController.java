package com.cq.springcloud.controller;

import com.cq.springcloud.model.Custinfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
    @RequestMapping("/")
    public ModelAndView index(Model model) {
        model.addAttribute("custinfo", new Custinfo());
        return new ModelAndView("login");
    }
}
