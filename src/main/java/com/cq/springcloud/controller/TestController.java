package com.cq.springcloud.controller;
import com.cq.springcloud.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @Autowired
    private TestDao testDao;
    @RequestMapping("/testMySql")
    public ModelAndView buildOrder( ){
        testDao.insertkk();
         testDao.getName();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index1");
        return mv;

    }
}
