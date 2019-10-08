package com.cq.springcloud.controller;
import com.cq.springcloud.FeignService.PayFeignService;
import com.cq.springcloud.dao.TestDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private PayFeignService payFeignService;
    @RequestMapping("/testMySql")
    @ResponseBody
    public String buildOrder(){
        String sno = "123";
        String responseStr =  payFeignService.pay(sno);
        log.info("---------------responseStr:"+responseStr);
        return "success";
    }
}
