package com.free.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 1.远程调用别的服务
* 1.1引入open-feign
* 1.2编写一个接口，专门用来调用远程服务
*    声明每一个方法调用的是哪一个远程服务方法
* 1.3开启远程调用功能
*
*
*
* */
@EnableFeignClients(basePackages = "com.free.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
