package com.halo.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.halo.demo.mapper"})
public class HaloDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HaloDemoApplication.class, args);
        System.out.println("HaloDemoApplication START SUCCESS ... ...");
    }

}
