package com.ligf.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName UserApplication
 * @Description user服务启动类
 * @Author Garment Lee
 * @Date 2021/3/15 0:53
 **/
@MapperScan("com.ligf.user.dao") //扫描的mapper
@SpringBootApplication
@EnableDiscoveryClient
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
