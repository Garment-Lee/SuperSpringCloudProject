package com.ligf.productserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ProductServerApplication
 * @Description Product Server 启动类
 * @Author Garment Lee
 * @Date 2021/3/17 11:16
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ProductServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductServerApplication.class, args);
    }

}
