package com.meizikuan.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.meizikuan.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 杨丁
 * \* Date: 2019/7/2 0002
 * \* Time: 15:29
 * \* Description:
 * \
 */
@Component
@Service(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello World";
    }
}
