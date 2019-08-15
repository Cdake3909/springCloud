package com.cq.springcloud.controller;

import com.cq.springcloud.FeignService.StockFeignService;
import com.cq.springcloud.dao.StockDealDao;
import com.cq.springcloud.model.Order;
import com.cq.springcloud.service.StockDealService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockDealController {
    @Autowired
    StockDealService stockDealService ;

    @Autowired
    StockFeignService stockFeignService;


    @RequestMapping("/buildOrder")
    public int buildOrder(Order order ){
        /***/
        String feignStr = stockFeignService.test();
        System.out.println("feignStr:"+feignStr);

        return 0;
    }
}
