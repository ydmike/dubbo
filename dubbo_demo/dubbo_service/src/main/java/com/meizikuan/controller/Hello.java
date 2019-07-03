package com.meizikuan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.meizikuan.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 杨丁
 * \* Date: 2019/7/2 0002
 * \* Time: 14:20
 * \* Description:
 * \
 */
@RestController
public class Hello {

    @Reference(version = "${demo.service.version}")
    private HelloService helloService;

    @RequestMapping("/")
    public String sayHello(){
       return helloService.sayHello();
    }

}
