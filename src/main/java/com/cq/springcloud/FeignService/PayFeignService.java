package com.cq.springcloud.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("eBankEngine")
public interface PayFeignService {
    @RequestMapping(value = "/pay",method = RequestMethod.POST)
    public String pay(@RequestParam(value = "sno") String sno);
}
