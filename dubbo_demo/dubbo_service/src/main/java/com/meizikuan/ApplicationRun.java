package com.meizikuan;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 杨丁
 * \* Date: 2019/7/2 0002
 * \* Time: 14:18
 * \* Description:
 * \
 */
@EnableDubbo
@SpringBootApplication
public class ApplicationRun {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun.class,args);
    }
}
