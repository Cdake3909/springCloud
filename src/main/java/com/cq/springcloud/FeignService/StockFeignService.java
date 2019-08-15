package com.cq.springcloud.FeignService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "stock-server")
public interface StockFeignService {
    @RequestMapping("/test")
    String test();
}
