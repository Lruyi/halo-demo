package com.halo.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(basePackages = {"com.halo.demo.mapper"})
@EnableFeignClients(basePackages = {"com.halo.demo.remote"})
public class HaloDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaloDemoApplication.class, args);
        System.out.println("HaloDemoApplication START SUCCESS ... ...");
    }

}
