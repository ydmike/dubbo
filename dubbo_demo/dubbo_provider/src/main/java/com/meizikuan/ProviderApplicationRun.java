package com.meizikuan;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 杨丁
 * \* Date: 2019/7/2 0002
 * \* Time: 15:35
 * \* Description:
 * \
 */
@EnableDubboConfiguration
@SpringBootApplication
public class ProviderApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplicationRun.class,args);
    }
}
