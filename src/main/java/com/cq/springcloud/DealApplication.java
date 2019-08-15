package com.cq.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
@MapperScan("com.cq.springcloud.dao")
public class DealApplication {

    public static void main(String[] args) {
        SpringApplication.run(DealApplication.class, args);
    }

    //@Value("${server.port}")
    @Value("${server.port}")
    String port;

    //@RequestMapping("/hi")
    @RequestMapping("/hi")
    public String home(@RequestParam String name)
    {
        return "hi " + name + ",i am from port:" + port;
    }

}
